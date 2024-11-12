package com.matheusvsdev.bank.controller;

import com.matheusvsdev.bank.dto.CreatePersonalAccountDTO;
import com.matheusvsdev.bank.dto.ResponsePersonalAccountDTO;
import com.matheusvsdev.bank.service.PersonalAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/personalAccount")
public class PersonalAccountController {

    @Autowired
    private PersonalAccountService personalAccountService;

    @PostMapping
    public ResponseEntity<ResponsePersonalAccountDTO> createPersonalAccount(@RequestBody CreatePersonalAccountDTO dto) {
        ResponsePersonalAccountDTO personalAccount = personalAccountService.createPersonalAccount(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(personalAccount.getId())
                .toUri();

        return ResponseEntity.created(uri).body(personalAccount);
    }
}
