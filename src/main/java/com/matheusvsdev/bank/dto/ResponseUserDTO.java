package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.User;

import java.time.LocalDate;
import java.util.Date;

public class ResponseUserDTO {

    private Long id;

    private String fullName;

    private LocalDate birthDate;

    private String cpfCnpj;

    private String email;

    public ResponseUserDTO() {
    }

    public ResponseUserDTO(Long id, String fullName, LocalDate birthDate, String cpfCnpj, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
    }

    public ResponseUserDTO(User entity) {
        id = entity.getId();
        fullName = entity.getFullName();
        birthDate = entity.getBirthDate();
        cpfCnpj = entity.getCpfCnpj();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

}
