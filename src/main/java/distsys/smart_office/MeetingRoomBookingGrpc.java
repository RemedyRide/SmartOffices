package distsys.smart_office;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Meeting room
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: smartoffice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MeetingRoomBookingGrpc {

  private MeetingRoomBookingGrpc() {}

  public static final String SERVICE_NAME = "distsys.smart_office.MeetingRoomBooking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest,
      distsys.smart_office.SmartOfficeProto.BookingResponse> getBookRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookRoom",
      requestType = distsys.smart_office.SmartOfficeProto.BookingRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest,
      distsys.smart_office.SmartOfficeProto.BookingResponse> getBookRoomMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest, distsys.smart_office.SmartOfficeProto.BookingResponse> getBookRoomMethod;
    if ((getBookRoomMethod = MeetingRoomBookingGrpc.getBookRoomMethod) == null) {
      synchronized (MeetingRoomBookingGrpc.class) {
        if ((getBookRoomMethod = MeetingRoomBookingGrpc.getBookRoomMethod) == null) {
          MeetingRoomBookingGrpc.getBookRoomMethod = getBookRoomMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.BookingRequest, distsys.smart_office.SmartOfficeProto.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingRoomBookingMethodDescriptorSupplier("BookRoom"))
              .build();
        }
      }
    }
    return getBookRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest,
      distsys.smart_office.SmartOfficeProto.BookingResponse> getCancelBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelBooking",
      requestType = distsys.smart_office.SmartOfficeProto.BookingRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.BookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest,
      distsys.smart_office.SmartOfficeProto.BookingResponse> getCancelBookingMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.BookingRequest, distsys.smart_office.SmartOfficeProto.BookingResponse> getCancelBookingMethod;
    if ((getCancelBookingMethod = MeetingRoomBookingGrpc.getCancelBookingMethod) == null) {
      synchronized (MeetingRoomBookingGrpc.class) {
        if ((getCancelBookingMethod = MeetingRoomBookingGrpc.getCancelBookingMethod) == null) {
          MeetingRoomBookingGrpc.getCancelBookingMethod = getCancelBookingMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.BookingRequest, distsys.smart_office.SmartOfficeProto.BookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.BookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.BookingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MeetingRoomBookingMethodDescriptorSupplier("CancelBooking"))
              .build();
        }
      }
    }
    return getCancelBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingRoomBookingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingStub>() {
        @java.lang.Override
        public MeetingRoomBookingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingRoomBookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingBlockingStub>() {
        @java.lang.Override
        public MeetingRoomBookingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingBlockingStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingRoomBookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MeetingRoomBookingFutureStub>() {
        @java.lang.Override
        public MeetingRoomBookingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MeetingRoomBookingFutureStub(channel, callOptions);
        }
      };
    return MeetingRoomBookingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Meeting room
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void bookRoom(distsys.smart_office.SmartOfficeProto.BookingRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookRoomMethod(), responseObserver);
    }

    /**
     */
    default void cancelBooking(distsys.smart_office.SmartOfficeProto.BookingRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelBookingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MeetingRoomBooking.
   * <pre>
   * Meeting room
   * </pre>
   */
  public static abstract class MeetingRoomBookingImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MeetingRoomBookingGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting room
   * </pre>
   */
  public static final class MeetingRoomBookingStub
      extends io.grpc.stub.AbstractAsyncStub<MeetingRoomBookingStub> {
    private MeetingRoomBookingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingStub(channel, callOptions);
    }

    /**
     */
    public void bookRoom(distsys.smart_office.SmartOfficeProto.BookingRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelBooking(distsys.smart_office.SmartOfficeProto.BookingRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting room
   * </pre>
   */
  public static final class MeetingRoomBookingBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MeetingRoomBookingBlockingStub> {
    private MeetingRoomBookingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.BookingResponse bookRoom(distsys.smart_office.SmartOfficeProto.BookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.BookingResponse cancelBooking(distsys.smart_office.SmartOfficeProto.BookingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MeetingRoomBooking.
   * <pre>
   * Meeting room
   * </pre>
   */
  public static final class MeetingRoomBookingFutureStub
      extends io.grpc.stub.AbstractFutureStub<MeetingRoomBookingFutureStub> {
    private MeetingRoomBookingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomBookingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MeetingRoomBookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.BookingResponse> bookRoom(
        distsys.smart_office.SmartOfficeProto.BookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.BookingResponse> cancelBooking(
        distsys.smart_office.SmartOfficeProto.BookingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_ROOM = 0;
  private static final int METHODID_CANCEL_BOOKING = 1;

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
        case METHODID_BOOK_ROOM:
          serviceImpl.bookRoom((distsys.smart_office.SmartOfficeProto.BookingRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse>) responseObserver);
          break;
        case METHODID_CANCEL_BOOKING:
          serviceImpl.cancelBooking((distsys.smart_office.SmartOfficeProto.BookingRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.BookingResponse>) responseObserver);
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
          getBookRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.BookingRequest,
              distsys.smart_office.SmartOfficeProto.BookingResponse>(
                service, METHODID_BOOK_ROOM)))
        .addMethod(
          getCancelBookingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.BookingRequest,
              distsys.smart_office.SmartOfficeProto.BookingResponse>(
                service, METHODID_CANCEL_BOOKING)))
        .build();
  }

  private static abstract class MeetingRoomBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingRoomBookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distsys.smart_office.SmartOfficeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingRoomBooking");
    }
  }

  private static final class MeetingRoomBookingFileDescriptorSupplier
      extends MeetingRoomBookingBaseDescriptorSupplier {
    MeetingRoomBookingFileDescriptorSupplier() {}
  }

  private static final class MeetingRoomBookingMethodDescriptorSupplier
      extends MeetingRoomBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeetingRoomBookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeetingRoomBookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingRoomBookingFileDescriptorSupplier())
              .addMethod(getBookRoomMethod())
              .addMethod(getCancelBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
