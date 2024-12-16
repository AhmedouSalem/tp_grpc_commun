package org.isd.stubs;

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
    comments = "Source: consulteroffre.proto")
public final class HotelServiceConsulterGrpc {

  private HotelServiceConsulterGrpc() {}

  public static final String SERVICE_NAME = "HotelServiceConsulter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.isd.stubs.Consulteroffre.ConsultRequest,
      org.isd.stubs.Consulteroffre.ConsultResponse> getConsulterDisponibilitesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consulterDisponibilites",
      requestType = org.isd.stubs.Consulteroffre.ConsultRequest.class,
      responseType = org.isd.stubs.Consulteroffre.ConsultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.isd.stubs.Consulteroffre.ConsultRequest,
      org.isd.stubs.Consulteroffre.ConsultResponse> getConsulterDisponibilitesMethod() {
    io.grpc.MethodDescriptor<org.isd.stubs.Consulteroffre.ConsultRequest, org.isd.stubs.Consulteroffre.ConsultResponse> getConsulterDisponibilitesMethod;
    if ((getConsulterDisponibilitesMethod = HotelServiceConsulterGrpc.getConsulterDisponibilitesMethod) == null) {
      synchronized (HotelServiceConsulterGrpc.class) {
        if ((getConsulterDisponibilitesMethod = HotelServiceConsulterGrpc.getConsulterDisponibilitesMethod) == null) {
          HotelServiceConsulterGrpc.getConsulterDisponibilitesMethod = getConsulterDisponibilitesMethod = 
              io.grpc.MethodDescriptor.<org.isd.stubs.Consulteroffre.ConsultRequest, org.isd.stubs.Consulteroffre.ConsultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelServiceConsulter", "consulterDisponibilites"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.stubs.Consulteroffre.ConsultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.stubs.Consulteroffre.ConsultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceConsulterMethodDescriptorSupplier("consulterDisponibilites"))
                  .build();
          }
        }
     }
     return getConsulterDisponibilitesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceConsulterStub newStub(io.grpc.Channel channel) {
    return new HotelServiceConsulterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceConsulterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelServiceConsulterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceConsulterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelServiceConsulterFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelServiceConsulterImplBase implements io.grpc.BindableService {

    /**
     */
    public void consulterDisponibilites(org.isd.stubs.Consulteroffre.ConsultRequest request,
        io.grpc.stub.StreamObserver<org.isd.stubs.Consulteroffre.ConsultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsulterDisponibilitesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConsulterDisponibilitesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.isd.stubs.Consulteroffre.ConsultRequest,
                org.isd.stubs.Consulteroffre.ConsultResponse>(
                  this, METHODID_CONSULTER_DISPONIBILITES)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceConsulterStub extends io.grpc.stub.AbstractStub<HotelServiceConsulterStub> {
    private HotelServiceConsulterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceConsulterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceConsulterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceConsulterStub(channel, callOptions);
    }

    /**
     */
    public void consulterDisponibilites(org.isd.stubs.Consulteroffre.ConsultRequest request,
        io.grpc.stub.StreamObserver<org.isd.stubs.Consulteroffre.ConsultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsulterDisponibilitesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceConsulterBlockingStub extends io.grpc.stub.AbstractStub<HotelServiceConsulterBlockingStub> {
    private HotelServiceConsulterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceConsulterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceConsulterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceConsulterBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.isd.stubs.Consulteroffre.ConsultResponse consulterDisponibilites(org.isd.stubs.Consulteroffre.ConsultRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsulterDisponibilitesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceConsulterFutureStub extends io.grpc.stub.AbstractStub<HotelServiceConsulterFutureStub> {
    private HotelServiceConsulterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceConsulterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceConsulterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceConsulterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.isd.stubs.Consulteroffre.ConsultResponse> consulterDisponibilites(
        org.isd.stubs.Consulteroffre.ConsultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsulterDisponibilitesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSULTER_DISPONIBILITES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceConsulterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceConsulterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTER_DISPONIBILITES:
          serviceImpl.consulterDisponibilites((org.isd.stubs.Consulteroffre.ConsultRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.stubs.Consulteroffre.ConsultResponse>) responseObserver);
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

  private static abstract class HotelServiceConsulterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceConsulterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.isd.stubs.Consulteroffre.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelServiceConsulter");
    }
  }

  private static final class HotelServiceConsulterFileDescriptorSupplier
      extends HotelServiceConsulterBaseDescriptorSupplier {
    HotelServiceConsulterFileDescriptorSupplier() {}
  }

  private static final class HotelServiceConsulterMethodDescriptorSupplier
      extends HotelServiceConsulterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceConsulterMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelServiceConsulterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceConsulterFileDescriptorSupplier())
              .addMethod(getConsulterDisponibilitesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
