package com.miy33t.bankservice.server;

import com.miy33t.bankservice.services.BankGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9999)
                .addService(new BankGrpcServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
