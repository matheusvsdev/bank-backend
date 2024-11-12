package com.matheusvsdev.bank.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imgUrl;

    private String fullName;

    @Column(unique = true)
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(mappedBy = "client")
    private List<BusinessAccount> businessAccounts = new ArrayList<>();

    @OneToOne(mappedBy = "client")
    private PersonalAccount personalAccount;

    public User() {
    }

    public User(Long id, String imgUrl, String fullName, String cpf, LocalDate birthDate) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.fullName = fullName;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<BusinessAccount> getBusinessAccounts() {
        return businessAccounts;
    }

    public void setBusinessAccounts(List<BusinessAccount> businessAccounts) {
        this.businessAccounts = businessAccounts;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(PersonalAccount personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
