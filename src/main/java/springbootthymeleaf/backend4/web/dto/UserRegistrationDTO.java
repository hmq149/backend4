package springbootthymeleaf.backend4.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

     public UserRegistrationDTO() {

    }

    public UserRegistrationDTO(String firstName, String lastName, String email, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
