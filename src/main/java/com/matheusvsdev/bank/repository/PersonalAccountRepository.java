package com.matheusvsdev.bank.repository;

import com.matheusvsdev.bank.entity.PersonalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalAccountRepository extends JpaRepository<PersonalAccount, Long> {
}
