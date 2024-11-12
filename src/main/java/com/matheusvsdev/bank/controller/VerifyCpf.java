package com.matheusvsdev.bank.controller;

import com.matheusvsdev.bank.entity.User;
import com.matheusvsdev.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyCpf {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/verify-cpf")
    public ResponseEntity<Boolean> verifyCpf(@RequestParam String cpf) {
        User user = userRepository.findByCpf(cpf);
        if (user != null) {
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.ok(false);
        }
    }
}
