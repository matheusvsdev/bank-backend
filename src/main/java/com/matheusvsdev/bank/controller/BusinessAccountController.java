package com.matheusvsdev.bank.controller;

import com.matheusvsdev.bank.dto.CreateBusinessAccountDTO;
import com.matheusvsdev.bank.dto.CreatePersonalAccountDTO;
import com.matheusvsdev.bank.dto.ResponseBusinessAccountDTO;
import com.matheusvsdev.bank.dto.ResponsePersonalAccountDTO;
import com.matheusvsdev.bank.service.BusinessAccountService;
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
@RequestMapping(value = "/businessAccount")
public class BusinessAccountController {

    @Autowired
    private BusinessAccountService businessAccountService;

    @PostMapping
    public ResponseEntity<ResponseBusinessAccountDTO> createBusinessAccount(@RequestBody CreateBusinessAccountDTO dto) {
        ResponseBusinessAccountDTO businessAccount = businessAccountService.createBusinessAccount(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(businessAccount.getId())
                .toUri();

        return ResponseEntity.created(uri).body(businessAccount);
    }
}
