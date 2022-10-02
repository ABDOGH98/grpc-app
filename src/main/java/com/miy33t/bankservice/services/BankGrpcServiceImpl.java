package com.miy33t.bankservice.services;

import com.miy33t.bankservice.grpc.stub.Bank;
import com.miy33t.bankservice.grpc.stub.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBankAccount(Bank.GetBankAccountRequest request, StreamObserver<Bank.GetBankAccountResponse> responseObserver) {
        super.getBankAccount(request, responseObserver);
    }

    @Override
    public void getListAccounts(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        super.getListAccounts(request, responseObserver);
    }

    @Override
    public void convertCurrency(Bank.ConvertCuurencyRequest request, StreamObserver<Bank.ConvertCuurencyResponse> responseObserver) {
        String from = request.getCurrencyFrom();
        String to = request.getCurrencyTo();
        double amount = request.getAmount();
        double result = amount*10.8 ;

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
