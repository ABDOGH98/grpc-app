package com.miy33t.bankservice.repositories;

import com.miy33t.bankservice.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
    public Currency findByName(String name);
}
