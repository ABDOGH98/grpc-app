package com.miy33t.bankservice.mappers;

import com.miy33t.bankservice.entities.Account;
import com.miy33t.bankservice.entities.AccountStatus;
import com.miy33t.bankservice.entities.AccountType;
import com.miy33t.bankservice.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImpl {

    public Bank.BankAccount fromBankAccount(Account account){
        Bank.BankAccount bankAccount = Bank.BankAccount.newBuilder()
                .setAccountId(account.getId())
                .setBalance(account.getBalance())
                .setCreatedAt(account.getCreateAt())
                .setType(Bank.AccountType.valueOf(account.getType().toString()))
                .setState(Bank.AccountState.valueOf(account.getStatus().toString()))
                .build();
        return bankAccount;
    }

    public Account fromGrpcAccount(Bank.BankAccount bankAccount){
        Account account = new Account();
        account.setId(bankAccount.getAccountId());
        account.setCreateAt(bankAccount.getCreatedAt());
        account.setStatus(AccountStatus.valueOf(bankAccount.getState().toString()));
        account.setType(AccountType.valueOf(bankAccount.getType().toString()));
        return account;
    }
}
