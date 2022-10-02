package com.miy33t.bankservice.client;

import com.miy33t.bankservice.grpc.stub.Bank;
import com.miy33t.bankservice.grpc.stub.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class GrpcClient {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9999)
                .usePlaintext()
                .build();
        //Blocking mode
        BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCuurencyRequest cuurencyRequest = Bank.ConvertCuurencyRequest.newBuilder()
                .setAmount(300)
                .setCurrencyFrom("EUR")
                .setCurrencyTo("MAD")
                .build();
        Bank.ConvertCuurencyResponse cuurencyResponse = blockingStub.convertCurrency(cuurencyRequest);

        System.out.println(String.format("%f en %s => %f en %s",cuurencyResponse.getAmount()
                ,cuurencyResponse.getCurrencyFrom()
                ,cuurencyResponse.getConversionResult()
                ,cuurencyResponse.getCurrencyTo()));
        //none blocking mode
        BankServiceGrpc.BankServiceStub bankServiceStub = BankServiceGrpc.newStub(managedChannel);
        bankServiceStub.convertCurrency(cuurencyRequest, new StreamObserver<Bank.ConvertCuurencyResponse>() {
            @Override
            public void onNext(Bank.ConvertCuurencyResponse response) {
                System.out.println(String.format("%f en %s => %f en %s",response.getAmount()
                        ,response.getCurrencyFrom()
                        ,response.getConversionResult()
                        ,response.getCurrencyTo()));
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("GG");
            }
        });
        System.in.read();
    }
}
