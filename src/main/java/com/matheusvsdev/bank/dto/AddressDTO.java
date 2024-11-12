package com.matheusvsdev.bank.dto;

import com.matheusvsdev.bank.entity.Address;
import com.matheusvsdev.bank.entity.State;

public class AddressDTO {

    private Long id;

    private String cep;

    private State state;

    private String city;

    private String district;

    private String street;

    private String number;

    private String complement;

    public AddressDTO() {
    }

    public AddressDTO(Long id
            , String cep
            , State state
            , String city
            , String district
            , String street
            , String number
            , String complement) {

        this.id = id;
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.number = number;
        this.complement = complement;
    }

    public AddressDTO(Address entity) {
        id = entity.getId();
        cep = entity.getCep();
        state = entity.getState();
        city = entity.getCity();
        district = entity.getDistrict();
        street = entity.getStreet();
        number = entity.getNumber();
        complement = entity.getComplement();
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public State getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }
}
