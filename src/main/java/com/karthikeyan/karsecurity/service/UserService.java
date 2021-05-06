package com.karthikeyan.karsecurity.service;

import com.karthikeyan.karsecurity.model.User;
import com.karthikeyan.karsecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
