package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.AccountStatus;
import com.matheusvsdev.bank.entity.PersonalAccount;

import java.math.BigDecimal;
import java.time.Instant;

public class ResponsePersonalAccountDTO {

    private Long id;

    private String rg;

    private String email;

    private BigDecimal balance = BigDecimal.ZERO;

    private Instant openingDate;

    private AccountStatus status;

    private ResponseUserDTO client;

    private AddressDTO address;

    public ResponsePersonalAccountDTO() {
    }

    public ResponsePersonalAccountDTO(Long id
            , String rg
            , String email
            , BigDecimal balance
            , Instant openingDate
            , AccountStatus status
            , ResponseUserDTO client
            , AddressDTO address) {

        this.id = id;
        this.rg = rg;
        this.email = email;
        this.balance = balance;
        this.openingDate = openingDate;
        this.status = status;
        this.client = client;
        this.address = address;
    }

    public ResponsePersonalAccountDTO(PersonalAccount entity) {
        id = entity.getId();
        rg = entity.getRg();
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

    public String getRg() {
        return rg;
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
