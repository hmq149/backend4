package springbootthymeleaf.backend4.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import springbootthymeleaf.backend4.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {
    void save(UserRegistrationDTO registrationDTO);
}
