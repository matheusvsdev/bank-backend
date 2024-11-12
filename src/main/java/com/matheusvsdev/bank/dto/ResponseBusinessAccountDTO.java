package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.AccountStatus;
import com.matheusvsdev.bank.entity.BusinessAccount;
import com.matheusvsdev.bank.entity.PersonalAccount;

import java.math.BigDecimal;
import java.time.Instant;

public class ResponseBusinessAccountDTO {

    private Long id;

    private String cnpj;

    private String companyName;

    private String email;

    private BigDecimal balance = BigDecimal.ZERO;

    private Instant openingDate;

    private AccountStatus status;

    private ResponseUserDTO client;

    private AddressDTO address;

    public ResponseBusinessAccountDTO() {
    }

    public ResponseBusinessAccountDTO(Long id
            , String cnpj
            , String companyName
            , String email
            , BigDecimal balance
            , Instant openingDate
            , AccountStatus status
            , ResponseUserDTO client
            , AddressDTO address) {

        this.id = id;
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.email = email;
        this.balance = balance;
        this.openingDate = openingDate;
        this.status = status;
        this.client = client;
        this.address = address;
    }

    public ResponseBusinessAccountDTO(BusinessAccount entity) {
        id = entity.getId();
        cnpj = entity.getCnpj();
        companyName = entity.getCompanyName();
        email = entity.getEmail();
        balance = entity.getBalance();
        openingDate = entity.getOpeningDate();
        status = entity.getStatus();
        client = new ResponseUserDTO(entity.getClient());
        address = new AddressDTO(entity.getAddress());
    }

    public Long getId() {
        return id;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public Instant getOpeningDate() {
        return openingDate;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public ResponseUserDTO getClient() {
        return client;
    }

    public AddressDTO getAddress() {
        return address;
    }
}
