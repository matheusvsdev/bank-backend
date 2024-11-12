package com.matheusvsdev.bank.service;

import com.matheusvsdev.bank.dto.AddressDTO;
import com.matheusvsdev.bank.entity.Address;
import com.matheusvsdev.bank.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Transactional
    public Address createAddress(AddressDTO dto) {
        Address address = new Address(
                null,
                dto.getCep(),
                dto.getState(),
                dto.getCity(),
                dto.getDistrict(),
                dto.getStreet(),
                dto.getNumber(),
                dto.getComplement()
        );


        address = addressRepository.save(address);

        return address;
    }
}
