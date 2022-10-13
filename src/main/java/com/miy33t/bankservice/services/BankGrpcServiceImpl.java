package com.miy33t.bankservice.services;

import com.miy33t.bankservice.entities.Account;
import com.miy33t.bankservice.entities.Currency;
import com.miy33t.bankservice.grpc.stub.Bank;
import com.miy33t.bankservice.grpc.stub.BankServiceGrpc;
import com.miy33t.bankservice.mappers.BankAccountMapperImpl;
import com.miy33t.bankservice.repositories.AccountRepository;
import com.miy33t.bankservice.repositories.CurrencyRepository;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
@NoArgsConstructor
public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BankAccountMapperImpl accountMapper;

    @Override
    public void getBankAccount(Bank.GetBankAccountRequest request, StreamObserver<Bank.GetBankAccountResponse> responseObserver) {
        String accountId = request.getAccountId();
        Account account = accountRepository.findById(accountId).orElse(null);
        if (account != null) {
            Bank.BankAccount bankAccount = accountMapper.fromBankAccount(account);
            Bank.GetBankAccountResponse accountResponse = Bank.GetBankAccountResponse.newBuilder()
                    .setBankAccount(bankAccount)
                    .build();
            responseObserver.onNext(accountResponse);
            responseObserver.onCompleted();
        }

    }

    @Override
    public void getListAccounts(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        List<Account> accountList = accountRepository.findAll();
        List<Bank.BankAccount> grpcAccountList = accountList.stream().map(account -> accountMapper.fromBankAccount(account)).collect(Collectors.toList());
        Bank.GetListAccountResponse listAccountResponse = Bank.GetListAccountResponse.newBuilder()
                .addAllBankAccount(grpcAccountList)
                .build();
        responseObserver.onNext(listAccountResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void convertCurrency(Bank.ConvertCuurencyRequest request, StreamObserver<Bank.ConvertCuurencyResponse> responseObserver) {
        String from = request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        Currency currencyFrom = currencyRepository.findByName(from);
        Currency currencyTo = currencyRepository.findByName(to);
        //double result = amount*10.8 ;
        double result = amount * currencyTo.getPrice() / currencyFrom.getPrice();
        Bank.ConvertCuurencyResponse convertCuurencyResponse = Bank.ConvertCuurencyResponse.newBuilder()
                .setCurrencyFrom(from)
                .setCurrencyTo(to)
                .setConversionResult(result)
                .setAmount(amount)
                .build();
        responseObserver.onNext(convertCuurencyResponse);
        responseObserver.onCompleted();
    }
}
