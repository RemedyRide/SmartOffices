package distsys.smart_office;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Light Switch
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: smartoffice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightSwitchGrpc {

  private LightSwitchGrpc() {}

  public static final String SERVICE_NAME = "distsys.smart_office.LightSwitch";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest,
      distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOn",
      requestType = distsys.smart_office.SmartOfficeProto.LightRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest,
      distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOnMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest, distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOnMethod;
    if ((getTurnOnMethod = LightSwitchGrpc.getTurnOnMethod) == null) {
      synchronized (LightSwitchGrpc.class) {
        if ((getTurnOnMethod = LightSwitchGrpc.getTurnOnMethod) == null) {
          LightSwitchGrpc.getTurnOnMethod = getTurnOnMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.LightRequest, distsys.smart_office.SmartOfficeProto.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightSwitchMethodDescriptorSupplier("TurnOn"))
              .build();
        }
      }
    }
    return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest,
      distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOff",
      requestType = distsys.smart_office.SmartOfficeProto.LightRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.LightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest,
      distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.LightRequest, distsys.smart_office.SmartOfficeProto.LightResponse> getTurnOffMethod;
    if ((getTurnOffMethod = LightSwitchGrpc.getTurnOffMethod) == null) {
      synchronized (LightSwitchGrpc.class) {
        if ((getTurnOffMethod = LightSwitchGrpc.getTurnOffMethod) == null) {
          LightSwitchGrpc.getTurnOffMethod = getTurnOffMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.LightRequest, distsys.smart_office.SmartOfficeProto.LightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.LightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.LightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LightSwitchMethodDescriptorSupplier("TurnOff"))
              .build();
        }
      }
    }
    return getTurnOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightSwitchStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightSwitchStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightSwitchStub>() {
        @java.lang.Override
        public LightSwitchStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightSwitchStub(channel, callOptions);
        }
      };
    return LightSwitchStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightSwitchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightSwitchBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightSwitchBlockingStub>() {
        @java.lang.Override
        public LightSwitchBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightSwitchBlockingStub(channel, callOptions);
        }
      };
    return LightSwitchBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightSwitchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightSwitchFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightSwitchFutureStub>() {
        @java.lang.Override
        public LightSwitchFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightSwitchFutureStub(channel, callOptions);
        }
      };
    return LightSwitchFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Light Switch
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void turnOn(distsys.smart_office.SmartOfficeProto.LightRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     */
    default void turnOff(distsys.smart_office.SmartOfficeProto.LightRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightSwitch.
   * <pre>
   * Light Switch
   * </pre>
   */
  public static abstract class LightSwitchImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightSwitchGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightSwitch.
   * <pre>
   * Light Switch
   * </pre>
   */
  public static final class LightSwitchStub
      extends io.grpc.stub.AbstractAsyncStub<LightSwitchStub> {
    private LightSwitchStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightSwitchStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightSwitchStub(channel, callOptions);
    }

    /**
     */
    public void turnOn(distsys.smart_office.SmartOfficeProto.LightRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOff(distsys.smart_office.SmartOfficeProto.LightRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightSwitch.
   * <pre>
   * Light Switch
   * </pre>
   */
  public static final class LightSwitchBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightSwitchBlockingStub> {
    private LightSwitchBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightSwitchBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightSwitchBlockingStub(channel, callOptions);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.LightResponse turnOn(distsys.smart_office.SmartOfficeProto.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.LightResponse turnOff(distsys.smart_office.SmartOfficeProto.LightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightSwitch.
   * <pre>
   * Light Switch
   * </pre>
   */
  public static final class LightSwitchFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightSwitchFutureStub> {
    private LightSwitchFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightSwitchFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightSwitchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.LightResponse> turnOn(
        distsys.smart_office.SmartOfficeProto.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.LightResponse> turnOff(
        distsys.smart_office.SmartOfficeProto.LightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON = 0;
  private static final int METHODID_TURN_OFF = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON:
          serviceImpl.turnOn((distsys.smart_office.SmartOfficeProto.LightRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((distsys.smart_office.SmartOfficeProto.LightRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.LightResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTurnOnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.LightRequest,
              distsys.smart_office.SmartOfficeProto.LightResponse>(
                service, METHODID_TURN_ON)))
        .addMethod(
          getTurnOffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.LightRequest,
              distsys.smart_office.SmartOfficeProto.LightResponse>(
                service, METHODID_TURN_OFF)))
        .build();
  }

  private static abstract class LightSwitchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightSwitchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distsys.smart_office.SmartOfficeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightSwitch");
    }
  }

  private static final class LightSwitchFileDescriptorSupplier
      extends LightSwitchBaseDescriptorSupplier {
    LightSwitchFileDescriptorSupplier() {}
  }

  private static final class LightSwitchMethodDescriptorSupplier
      extends LightSwitchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightSwitchMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightSwitchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightSwitchFileDescriptorSupplier())
              .addMethod(getTurnOnMethod())
              .addMethod(getTurnOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
