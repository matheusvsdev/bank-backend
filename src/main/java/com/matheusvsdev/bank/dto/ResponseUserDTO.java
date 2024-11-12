package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.User;

import java.time.LocalDate;
import java.util.Date;

public class ResponseUserDTO {

    private Long id;

    private String imgUrl;

    private String fullName;

    private String cpf;

    private LocalDate birthDate;

    public ResponseUserDTO() {
    }

    public ResponseUserDTO(Long id
            , String imgUrl
            , String fullName
            , String cpf
            , LocalDate birthDate) {

        this.id = id;
        this.imgUrl = imgUrl;
        this.fullName = fullName;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public ResponseUserDTO(User entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        fullName = entity.getFullName();
        cpf = entity.getCpf();
        birthDate = entity.getBirthDate();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
