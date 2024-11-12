package com.matheusvsdev.bank.repository;

import com.matheusvsdev.bank.entity.BusinessAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessAccountRepository extends JpaRepository<BusinessAccount, Long> {
}
