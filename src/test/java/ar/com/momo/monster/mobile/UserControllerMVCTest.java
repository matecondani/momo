package ar.com.momo.monster.mobile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import ar.com.momo.monster.mobile.controller.UserController;
import ar.com.momo.monster.mobile.model.dto.UserCreationDTO;
import ar.com.momo.monster.mobile.service.UserService;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controllers = UserController.class)
public class UserControllerMVCTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService userService;

    @Test
    public void createUserMVC() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/user")
                .content(new ObjectMapper().writeValueAsString(new UserCreationDTO("jane")))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andReturn();
    }
}
