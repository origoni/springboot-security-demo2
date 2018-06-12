package com.millky.demo.security.two;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserJoinService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    public User join(User user) {

        if (userRepository.findByUsername(user.getUsername()) != null) {
            return null;
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        user.setRole(Role.USER);

        User newUser = userRepository.save(user);
        log.debug("newUser={}", newUser);

        return newUser;
    }
}
