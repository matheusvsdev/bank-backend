package com.matheusvsdev.bank.service;

import com.matheusvsdev.bank.dto.CreateBusinessAccountDTO;
import com.matheusvsdev.bank.dto.CreatePersonalAccountDTO;
import com.matheusvsdev.bank.dto.ResponseBusinessAccountDTO;
import com.matheusvsdev.bank.dto.ResponsePersonalAccountDTO;
import com.matheusvsdev.bank.entity.*;
import com.matheusvsdev.bank.repository.BusinessAccountRepository;
import com.matheusvsdev.bank.repository.PersonalAccountRepository;
import com.matheusvsdev.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class BusinessAccountService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private BusinessAccountRepository personalAccountRepository;

    @Autowired
    private AddressService addressService;

    @Transactional
    public ResponseBusinessAccountDTO createBusinessAccount(CreateBusinessAccountDTO dto) {

        User client = userService.createUser(dto.getClient());


        Address address =  addressService.createAddress(dto.getAddress());

        BusinessAccount businessAccount = new BusinessAccount();
        businessAccount.setClient(client);
        businessAccount.setCnpj(dto.getCnpj());
        businessAccount.setCompanyName(dto.getCompanyName());
        businessAccount.setEmail(dto.getEmail());
        businessAccount.setAccessPassword(dto.getAccessPassword());
        businessAccount.setTransactionPassword(dto.getTransactionPassword());
        businessAccount.setOpeningDate(Instant.now());
        businessAccount.setStatus(AccountStatus.ACTIVE);
        businessAccount.setAddress(address);


        businessAccount = personalAccountRepository.save(businessAccount);

        return new ResponseBusinessAccountDTO(businessAccount);
    }
}
