package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.User;

import java.util.Date;

public class CreateUserDTO {

    private String fullName;

    private Date birthDate;

    private String cpfCnpj;

    private String email;

    private String password;

    public CreateUserDTO() {
    }

    public CreateUserDTO(String fullName, Date birthDate, String cpfCnpj, String email, String password) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.password = password;
    }

    public CreateUserDTO(User entity) {
        fullName = entity.getFullName();
        birthDate = entity.getBirthDate();
        cpfCnpj = entity.getCpfCnpj();
        email = entity.getEmail();
        password = entity.getPassword();
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}