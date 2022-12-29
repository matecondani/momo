package ar.com.momo.monster.mobile.model.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class UserCreationDTO implements Serializable {

    @Pattern(regexp = "^[A-Za-z0-9]*$", message = "user-creation-dto.name.not-valid")
    @NotEmpty(message = "user-creation-dto.name.not-empty")
    private String name;

    public UserCreationDTO() {
        //No-args constructor
    }

    public UserCreationDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserCreationDTO{" +
            "name='" + name + '\'' +
            '}';
    }
}
