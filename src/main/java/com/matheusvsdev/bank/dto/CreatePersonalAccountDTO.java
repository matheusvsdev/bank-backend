package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.PersonalAccount;

public class CreatePersonalAccountDTO {

    private String rg;

    private String email;

    private String accessPassword;

    private String transactionPassword;

    private AddressDTO address;

    private CreateUserDTO client;

    public CreatePersonalAccountDTO() {
    }

    public CreatePersonalAccountDTO(String rg, String email, String accessPassword, String transactionPassword, AddressDTO address, CreateUserDTO client) {
        this.rg = rg;
        this.email = email;
        this.accessPassword = accessPassword;
        this.transactionPassword = transactionPassword;
        this.address = address;
        this.client = client;
    }

    public CreatePersonalAccountDTO(PersonalAccount entity) {
        rg = entity.getRg();
        email = entity.getEmail();
        accessPassword = entity.getAccessPassword();
        transactionPassword = entity.getTransactionPassword();
        address = new AddressDTO();
        client = new CreateUserDTO();
    }

    public String getRg() {
        return rg;
    }

    public String getEmail() {
        return email;
    }

    public String getAccessPassword() {
        return accessPassword;
    }

    public String getTransactionPassword() {
        return transactionPassword;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public CreateUserDTO getClient() {
        return client;
    }
}
