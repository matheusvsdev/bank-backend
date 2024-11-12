package com.matheusvsdev.bank.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_business_account")
public class BusinessAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String cnpj;

    @Column(unique = true)
    private String companyName;

    @Column(unique = true)
    private String email;

    private String accessPassword;

    private String transactionPassword;

    private BigDecimal balance = BigDecimal.ZERO;

    private Instant openingDate;

    private Instant closingDate;

    private AccountStatus status;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "client_id")
    private User client;

    public BusinessAccount() {
    }

    public BusinessAccount(Long id
            , String cnpj
            , String companyName
            , String email
            , String accessPassword
            , String transactionPassword
            , BigDecimal balance
            , Instant openingDate
            , Instant closingDate
            , AccountStatus status
            , Address address
            , User client) {

        this.id = id;
        this.cnpj = cnpj;
        this.companyName = companyName;
        this.email = email;
        this.accessPassword = accessPassword;
        this.transactionPassword = transactionPassword;
        this.balance = balance;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.status = status;
        this.address = address;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessPassword() {
        return accessPassword;
    }

    public void setAccessPassword(String accessPassword) {
        this.accessPassword = accessPassword;
    }

    public String getTransactionPassword() {
        return transactionPassword;
    }

    public void setTransactionPassword(String transactionPassword) {
        this.transactionPassword = transactionPassword;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Instant getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Instant openingDate) {
        this.openingDate = openingDate;
    }

    public Instant getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Instant closingDate) {
        this.closingDate = closingDate;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
