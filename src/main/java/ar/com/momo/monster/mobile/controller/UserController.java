package ar.com.momo.monster.mobile.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.com.momo.monster.mobile.model.dto.UserCreationDTO;
import ar.com.momo.monster.mobile.service.UserService;
import jakarta.validation.Valid;


@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid UserCreationDTO userCreationDTO) {
        return userService.createUser(userCreationDTO);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/{name}")
    public ResponseEntity<?> getUserByName(@PathVariable(value = "name") String name) {
        return userService.getUserByName(name);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> deleteUserByName(@PathVariable(value = "name") String name) {
        return userService.deleteUserByName(name);
    }

    @PutMapping("/{name}/rename")
    public ResponseEntity<?> deleteUserByName(@PathVariable(value = "name") String name,
                                              @RequestBody @Valid UserCreationDTO userCreationDTO) {
        return userService.updateUser(name, userCreationDTO);
    }
}
