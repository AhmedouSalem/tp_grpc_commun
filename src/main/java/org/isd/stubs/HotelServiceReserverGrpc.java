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
    comments = "Source: reserverchambre.proto")
public final class HotelServiceReserverGrpc {

  private HotelServiceReserverGrpc() {}

  public static final String SERVICE_NAME = "HotelServiceReserver";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.isd.stubs.Reserverchambre.ReserverRequest,
      org.isd.stubs.Reserverchambre.ReserverResponse> getEffectuerReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "effectuerReservation",
      requestType = org.isd.stubs.Reserverchambre.ReserverRequest.class,
      responseType = org.isd.stubs.Reserverchambre.ReserverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.isd.stubs.Reserverchambre.ReserverRequest,
      org.isd.stubs.Reserverchambre.ReserverResponse> getEffectuerReservationMethod() {
    io.grpc.MethodDescriptor<org.isd.stubs.Reserverchambre.ReserverRequest, org.isd.stubs.Reserverchambre.ReserverResponse> getEffectuerReservationMethod;
    if ((getEffectuerReservationMethod = HotelServiceReserverGrpc.getEffectuerReservationMethod) == null) {
      synchronized (HotelServiceReserverGrpc.class) {
        if ((getEffectuerReservationMethod = HotelServiceReserverGrpc.getEffectuerReservationMethod) == null) {
          HotelServiceReserverGrpc.getEffectuerReservationMethod = getEffectuerReservationMethod = 
              io.grpc.MethodDescriptor.<org.isd.stubs.Reserverchambre.ReserverRequest, org.isd.stubs.Reserverchambre.ReserverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HotelServiceReserver", "effectuerReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.stubs.Reserverchambre.ReserverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.isd.stubs.Reserverchambre.ReserverResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelServiceReserverMethodDescriptorSupplier("effectuerReservation"))
                  .build();
          }
        }
     }
     return getEffectuerReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceReserverStub newStub(io.grpc.Channel channel) {
    return new HotelServiceReserverStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceReserverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelServiceReserverBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceReserverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelServiceReserverFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelServiceReserverImplBase implements io.grpc.BindableService {

    /**
     */
    public void effectuerReservation(org.isd.stubs.Reserverchambre.ReserverRequest request,
        io.grpc.stub.StreamObserver<org.isd.stubs.Reserverchambre.ReserverResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEffectuerReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEffectuerReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.isd.stubs.Reserverchambre.ReserverRequest,
                org.isd.stubs.Reserverchambre.ReserverResponse>(
                  this, METHODID_EFFECTUER_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class HotelServiceReserverStub extends io.grpc.stub.AbstractStub<HotelServiceReserverStub> {
    private HotelServiceReserverStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceReserverStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceReserverStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceReserverStub(channel, callOptions);
    }

    /**
     */
    public void effectuerReservation(org.isd.stubs.Reserverchambre.ReserverRequest request,
        io.grpc.stub.StreamObserver<org.isd.stubs.Reserverchambre.ReserverResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEffectuerReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelServiceReserverBlockingStub extends io.grpc.stub.AbstractStub<HotelServiceReserverBlockingStub> {
    private HotelServiceReserverBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceReserverBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceReserverBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceReserverBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.isd.stubs.Reserverchambre.ReserverResponse effectuerReservation(org.isd.stubs.Reserverchambre.ReserverRequest request) {
      return blockingUnaryCall(
          getChannel(), getEffectuerReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelServiceReserverFutureStub extends io.grpc.stub.AbstractStub<HotelServiceReserverFutureStub> {
    private HotelServiceReserverFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelServiceReserverFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceReserverFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelServiceReserverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.isd.stubs.Reserverchambre.ReserverResponse> effectuerReservation(
        org.isd.stubs.Reserverchambre.ReserverRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEffectuerReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EFFECTUER_RESERVATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelServiceReserverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelServiceReserverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EFFECTUER_RESERVATION:
          serviceImpl.effectuerReservation((org.isd.stubs.Reserverchambre.ReserverRequest) request,
              (io.grpc.stub.StreamObserver<org.isd.stubs.Reserverchambre.ReserverResponse>) responseObserver);
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

  private static abstract class HotelServiceReserverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceReserverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.isd.stubs.Reserverchambre.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelServiceReserver");
    }
  }

  private static final class HotelServiceReserverFileDescriptorSupplier
      extends HotelServiceReserverBaseDescriptorSupplier {
    HotelServiceReserverFileDescriptorSupplier() {}
  }

  private static final class HotelServiceReserverMethodDescriptorSupplier
      extends HotelServiceReserverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelServiceReserverMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelServiceReserverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceReserverFileDescriptorSupplier())
              .addMethod(getEffectuerReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
