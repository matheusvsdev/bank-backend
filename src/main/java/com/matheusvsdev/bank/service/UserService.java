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
    public ResponseUserDTO createUser(CreateUserDTO dto) {
        User user = new User();
        convertingDtoToEntity(user, dto);

        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        user = userRepository.save(user);

        return new ResponseUserDTO(user);

    }

    public void convertingDtoToEntity(User entity, CreateUserDTO dto) {
        entity.setFullName(dto.getFullName());
        entity.setBirthDate(dto.getBirthDate());
        entity.setCpfCnpj(dto.getCpfCnpj());
        entity.setEmail(dto.getEmail());
    }
}
