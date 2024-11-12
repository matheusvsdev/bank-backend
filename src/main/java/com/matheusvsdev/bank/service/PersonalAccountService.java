package com.matheusvsdev.bank.service;

import com.matheusvsdev.bank.dto.*;
import com.matheusvsdev.bank.entity.AccountStatus;
import com.matheusvsdev.bank.entity.Address;
import com.matheusvsdev.bank.entity.PersonalAccount;
import com.matheusvsdev.bank.entity.User;
import com.matheusvsdev.bank.repository.PersonalAccountRepository;
import com.matheusvsdev.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class PersonalAccountService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private PersonalAccountRepository personalAccountRepository;

    @Autowired
    private AddressService addressService;

    @Transactional
    public ResponsePersonalAccountDTO createPersonalAccount(CreatePersonalAccountDTO dto) {


        User client = userService.createUser(dto.getClient());


        Address address =  addressService.createAddress(dto.getAddress());

        PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.setClient(client);
        personalAccount.setRg(dto.getRg());
        personalAccount.setEmail(dto.getEmail());
        personalAccount.setAccessPassword(dto.getAccessPassword());
        personalAccount.setTransactionPassword(dto.getTransactionPassword());
        personalAccount.setOpeningDate(Instant.now());
        personalAccount.setStatus(AccountStatus.ACTIVE);
        personalAccount.setAddress(address);


        personalAccount = personalAccountRepository.save(personalAccount);

        return new ResponsePersonalAccountDTO(personalAccount);
    }
}
