package ar.com.momo.monster.mobile;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import ar.com.momo.monster.mobile.model.dto.UserCreationDTO;
import ar.com.momo.monster.mobile.model.dto.UserDTO;
import ar.com.momo.monster.mobile.model.entity.Attribute;
import ar.com.momo.monster.mobile.model.entity.Momo;
import ar.com.momo.monster.mobile.model.entity.MomoAttribute;
import ar.com.momo.monster.mobile.model.entity.User;
import ar.com.momo.monster.mobile.model.entity.Wallet;
import ar.com.momo.monster.mobile.model.enums.Work;
import ar.com.momo.monster.mobile.model.exceptions.NotFoundException;
import ar.com.momo.monster.mobile.repository.IUserRepository;
import ar.com.momo.monster.mobile.service.AttributeService;
import ar.com.momo.monster.mobile.service.MomoAttributeService;
import ar.com.momo.monster.mobile.service.MomoService;
import ar.com.momo.monster.mobile.service.UserService;
import ar.com.momo.monster.mobile.service.WalletService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private IUserRepository userRepository;

    @Mock
    private MomoService momoService;

    @Mock
    private WalletService walletService;

    @Mock
    private AttributeService attributeService;

    @Mock
    private MomoAttributeService momoAttributeService;

    @Test
    @DisplayName("Should create a new user")
    public void shouldCreateANewUser() {
        UserCreationDTO userCreationDTO = new UserCreationDTO("John");
        UserDTO expectedUser = new UserDTO();
        expectedUser.setName("John");
        Momo expectedMomo = new Momo();
        expectedMomo.setName("Mumito");
        expectedUser.setMomos(List.of(expectedMomo));

        when(momoService.generateName()).thenReturn("Mumito");
        when(userRepository.save(any(User.class))).thenReturn(new User());

        ResponseEntity<?> responseEntity = userService.createUser(userCreationDTO);
        UserDTO responseUser = (UserDTO) responseEntity.getBody();
        assertEquals(expectedUser.getName(), responseUser.getName());
        assertEquals(expectedUser.getMomos().get(0).getName(), responseUser.getMomos().get(0).getName());
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    @DisplayName("Should get a user from ddbb")
    public void ShouldGetUserFromDatabase() {
        when(userRepository.findByName(eq("John"))).thenReturn(Optional.of(stubUser()));
        UserDTO responseUser = (UserDTO) userService.getUserByName("John").getBody();
        assertEquals("Momito", responseUser.getMomos().get(0).getName());
    }

    @Test
    @DisplayName("Should delete a user from ddbb")
    public void ShouldDeleteUserFromDatabase() {
        User user = stubUser();
        when(userRepository.findByName(eq("John"))).thenReturn(Optional.of(user));
        doNothing().when(userRepository).delete(user);
        userService.deleteUserByName("John");
        verify(userRepository, times(1)).delete(user);
    }

    private User stubUser() {
        User user = new User();
        user.setName("John");
        user.setMomos(List.of(new Momo("Momito", Work.MOUNTAIN, "Red", "image.jpg")));
        user.setAttributes(new Attribute(200, 100, 50, 50, 10, 10, 5, 5));
        user.setMomosAttributes(new MomoAttribute(10, 10));
        user.setWallet(new Wallet(200, 50));
        user.setSprite("JohnPicture.jpg");
        return user;
    }
}
