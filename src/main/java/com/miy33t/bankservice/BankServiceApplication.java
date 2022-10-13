package com.miy33t.bankservice;

import com.miy33t.bankservice.entities.Account;
import com.miy33t.bankservice.entities.AccountStatus;
import com.miy33t.bankservice.entities.AccountType;
import com.miy33t.bankservice.entities.Currency;
import com.miy33t.bankservice.repositories.AccountRepository;
import com.miy33t.bankservice.repositories.CurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class BankServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CurrencyRepository currencyRepository, AccountRepository accountRepository){
        return args -> {
            currencyRepository.save(new Currency(null,"USD","$",1));
            currencyRepository.save(new Currency(null,"MAD","DH",0.1));
            currencyRepository.save(new Currency(null,"EUR","€",0.98));
            currencyRepository.findAll().forEach(currency -> {
                System.out.println(currency);
            });
            List<Currency> currencyList = currencyRepository.findAll();
            for (int i = 1; i <10 ; i++) {
                Account account = Account.builder()
                        .id("CC"+i)
                        .currency(currencyList.get(new Random().nextInt(currencyList.size())))
                        .createAt(System.currentTimeMillis())
                        .balance(Math.random()*9000)
                        .type(Math.random()>0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                        .status(AccountStatus.CREATED)
                        .build();
                accountRepository.save(account);
            }
        };
    }

}
