package ar.com.momo.monster.mobile.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.dao.DuplicateKeyException;
import ar.com.momo.monster.mobile.model.dto.UserCreationDTO;
import ar.com.momo.monster.mobile.model.dto.UserDTO;
import ar.com.momo.monster.mobile.model.entity.Momo;
import ar.com.momo.monster.mobile.model.entity.User;
import ar.com.momo.monster.mobile.model.exceptions.EntityExistsException;
import ar.com.momo.monster.mobile.model.exceptions.InternalServerException;
import ar.com.momo.monster.mobile.model.exceptions.NotFoundException;
import ar.com.momo.monster.mobile.repository.IUserRepository;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    private IUserRepository userRepository;
    private MomoService momoService;
    private WalletService walletService;
    private AttributeService attributeService;
    private MomoAttributeService momoAttributeService;

    public UserService(IUserRepository userRepository, MomoService momoService, WalletService walletService,
                       AttributeService attributeService, MomoAttributeService momoAttributeService) {
        this.userRepository = userRepository;
        this.momoService = momoService;
        this.walletService = walletService;
        this.attributeService = attributeService;
        this.momoAttributeService = momoAttributeService;
    }

    public ResponseEntity<?> createUser(UserCreationDTO userCreationDTO) {
        User user = new User();
        user.setName(userCreationDTO.getName());
        Momo momo = new Momo();
        momo.setName(momoService.generateName());
        user.setMomos(List.of(momo));
        user.setWallet(walletService.initialWallet());
        user.setAttributes(attributeService.generateInitialAttributes());
        user.setMomosAttributes(momoAttributeService.generateInitialMomoAttributes());
        try {
            userRepository.save(user);
            return new ResponseEntity<>(generateDTOFromUser(user), HttpStatus.CREATED);
        } catch (DuplicateKeyException e) {
            throw new EntityExistsException("user-service.create-user.user.name.already-in-use");
        } catch (RuntimeException e) {
            LOG.error("Exception: {}, trying to save entity: {}", e.getMessage(), user);
            throw new InternalServerException("user-service.create-user.unexpected-exception");
        }
    }

    public ResponseEntity<?> getUserByName(String username) {
        User user = findUser(username);
        return new ResponseEntity<>(generateDTOFromUser(user), HttpStatus.OK);
    }

    public ResponseEntity<?> getAllUsers() {
        List<UserDTO> users = userRepository.findAll().stream().map(this::generateDTOFromUser).toList();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    public ResponseEntity<?> deleteUserByName(String username) {
        userRepository.delete(findUser(username));
        return new ResponseEntity<>(HttpEntity.EMPTY, HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<?> updateUser(String name, UserCreationDTO userCreationDTO) {
        User user = findUser(name);
        user.setName(userCreationDTO.getName());
        try {
            userRepository.save(user);
            return new ResponseEntity<>(generateDTOFromUser(user), HttpStatus.OK);
        } catch (DuplicateKeyException e) {
            throw new EntityExistsException("user-service.create-user.user.name.already-in-use");
        } catch (RuntimeException e) {
            LOG.error("Exception: {}, trying to save entity: {}", e.getMessage(), user);
            throw new InternalServerException("user-service.create-user.unexpected-exception");
        }
    }

    private User findUser(String username) {
        return userRepository.findByName(username)
            .orElseThrow(() -> new NotFoundException("user-service.find-user.not-found"));
    }

    private UserDTO generateDTOFromUser(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO, "id");
        return userDTO;
    }
}
