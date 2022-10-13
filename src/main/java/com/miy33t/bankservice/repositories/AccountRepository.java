package com.miy33t.bankservice.repositories;

import com.miy33t.bankservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {
}
