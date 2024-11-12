package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.BusinessAccount;
import com.matheusvsdev.bank.entity.PersonalAccount;

public class CreateBusinessAccountDTO {

    private String cnpj;

    private String companyName;

    private String email;

    private String accessPassword;

    private String transactionPassword;

    private AddressDTO address;

    private CreateUserDTO client;

    public CreateBusinessAccountDTO() {
    }

    public CreateBusinessAccountDTO(String cnpj, String companyName, String email, String accessPassword, String transactionPassword, AddressDTO address, CreateUserDTO client) {
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.email = email;
        this.accessPassword = accessPassword;
        this.transactionPassword = transactionPassword;
        this.address = address;
        this.client = client;
    }

    public CreateBusinessAccountDTO(BusinessAccount entity) {
        cnpj = entity.getCnpj();
        companyName = entity.getCompanyName();
        email = entity.getEmail();
        accessPassword = entity.getAccessPassword();
        transactionPassword = entity.getTransactionPassword();
        address = new AddressDTO();
        client = new CreateUserDTO();
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCompanyName() {
        return companyName;
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
