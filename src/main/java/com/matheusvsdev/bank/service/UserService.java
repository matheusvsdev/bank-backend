package com.matheusvsdev.bank.service;

import com.matheusvsdev.bank.dto.CreateUserDTO;
import com.matheusvsdev.bank.dto.ResponseUserDTO;
import com.matheusvsdev.bank.entity.User;
import com.matheusvsdev.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public User createUser(CreateUserDTO dto) {

        User user = new User(
                null,
                dto.getImgUrl(),
                dto.getFullName(),
                dto.getCpf(),
                dto.getBirthDate());

        user = userRepository.save(user);

        return user;
    }
}
