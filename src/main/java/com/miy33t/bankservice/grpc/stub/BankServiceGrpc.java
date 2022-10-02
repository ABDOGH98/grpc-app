package com.miy33t.bankservice.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest,
      com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBankAccount",
      requestType = com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest.class,
      responseType = com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest,
      com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod() {
    io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest, com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;
    if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
          BankServiceGrpc.getGetBankAccountMethod = getGetBankAccountMethod = 
              io.grpc.MethodDescriptor.<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest, com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBankAccount"))
                  .build();
          }
        }
     }
     return getGetBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest,
      com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccounts",
      requestType = com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest.class,
      responseType = com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest,
      com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod() {
    io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest, com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountsMethod;
    if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountsMethod = BankServiceGrpc.getGetListAccountsMethod) == null) {
          BankServiceGrpc.getGetListAccountsMethod = getGetListAccountsMethod = 
              io.grpc.MethodDescriptor.<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest, com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccounts"))
                  .build();
          }
        }
     }
     return getGetListAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest,
      com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest.class,
      responseType = com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest,
      com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest, com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod = 
              io.grpc.MethodDescriptor.<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest, com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
                  .build();
          }
        }
     }
     return getConvertCurrencyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBankAccount(com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccounts(com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountsMethod(), responseObserver);
    }

    /**
     */
    public void convertCurrency(com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest,
                com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse>(
                  this, METHODID_GET_BANK_ACCOUNT)))
          .addMethod(
            getGetListAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest,
                com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNTS)))
          .addMethod(
            getConvertCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest,
                com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse>(
                  this, METHODID_CONVERT_CURRENCY)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBankAccount(com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccounts(com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertCurrency(com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest request,
        io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse getBankAccount(com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse getListAccounts(com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse convertCurrency(com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse> getBankAccount(
        com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse> getListAccounts(
        com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse> convertCurrency(
        com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_ACCOUNT = 0;
  private static final int METHODID_GET_LIST_ACCOUNTS = 1;
  private static final int METHODID_CONVERT_CURRENCY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_ACCOUNT:
          serviceImpl.getBankAccount((com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetBankAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNTS:
          serviceImpl.getListAccounts((com.miy33t.bankservice.grpc.stub.Bank.GetListAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.GetListAccountResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyRequest) request,
              (io.grpc.stub.StreamObserver<com.miy33t.bankservice.grpc.stub.Bank.ConvertCuurencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.miy33t.bankservice.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBankAccountMethod())
              .addMethod(getGetListAccountsMethod())
              .addMethod(getConvertCurrencyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
