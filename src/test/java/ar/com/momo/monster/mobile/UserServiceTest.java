package ar.com.momo.monster.mobile;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import ar.com.momo.monster.mobile.model.dto.UserCreationDTO;
import ar.com.momo.monster.mobile.model.dto.UserDTO;
import ar.com.momo.monster.mobile.model.entity.Momo;
import ar.com.momo.monster.mobile.model.entity.User;
import ar.com.momo.monster.mobile.repository.IUserRepository;
import ar.com.momo.monster.mobile.service.AttributeService;
import ar.com.momo.monster.mobile.service.MomoAttributeService;
import ar.com.momo.monster.mobile.service.MomoService;
import ar.com.momo.monster.mobile.service.UserService;
import ar.com.momo.monster.mobile.service.WalletService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;


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
        expectedUser.setMomos(List.of(new Momo()));
        when(userRepository.save(any(User.class))).thenReturn(new User());

        ResponseEntity<?> responseEntity = userService.createUser(userCreationDTO);
        UserDTO responseUser = (UserDTO) responseEntity.getBody();
        assertEquals(expectedUser.getName(), responseUser.getName());
    }
}
