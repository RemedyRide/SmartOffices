package distsys.smart_office;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Printer and scanner
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: smartoffice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrinterScannerManagementGrpc {

  private PrinterScannerManagementGrpc() {}

  public static final String SERVICE_NAME = "distsys.smart_office.PrinterScannerManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrintRequest,
      distsys.smart_office.SmartOfficeProto.PrintResponse> getPrintDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrintDocument",
      requestType = distsys.smart_office.SmartOfficeProto.PrintRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.PrintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrintRequest,
      distsys.smart_office.SmartOfficeProto.PrintResponse> getPrintDocumentMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrintRequest, distsys.smart_office.SmartOfficeProto.PrintResponse> getPrintDocumentMethod;
    if ((getPrintDocumentMethod = PrinterScannerManagementGrpc.getPrintDocumentMethod) == null) {
      synchronized (PrinterScannerManagementGrpc.class) {
        if ((getPrintDocumentMethod = PrinterScannerManagementGrpc.getPrintDocumentMethod) == null) {
          PrinterScannerManagementGrpc.getPrintDocumentMethod = getPrintDocumentMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.PrintRequest, distsys.smart_office.SmartOfficeProto.PrintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrintDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.PrintRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.PrintResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrinterScannerManagementMethodDescriptorSupplier("PrintDocument"))
              .build();
        }
      }
    }
    return getPrintDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.ScanRequest,
      distsys.smart_office.SmartOfficeProto.ScanResponse> getScanDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanDocument",
      requestType = distsys.smart_office.SmartOfficeProto.ScanRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.ScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.ScanRequest,
      distsys.smart_office.SmartOfficeProto.ScanResponse> getScanDocumentMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.ScanRequest, distsys.smart_office.SmartOfficeProto.ScanResponse> getScanDocumentMethod;
    if ((getScanDocumentMethod = PrinterScannerManagementGrpc.getScanDocumentMethod) == null) {
      synchronized (PrinterScannerManagementGrpc.class) {
        if ((getScanDocumentMethod = PrinterScannerManagementGrpc.getScanDocumentMethod) == null) {
          PrinterScannerManagementGrpc.getScanDocumentMethod = getScanDocumentMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.ScanRequest, distsys.smart_office.SmartOfficeProto.ScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.ScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.ScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrinterScannerManagementMethodDescriptorSupplier("ScanDocument"))
              .build();
        }
      }
    }
    return getScanDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrinterStatusRequest,
      distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> getCheckPrinterStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPrinterStatus",
      requestType = distsys.smart_office.SmartOfficeProto.PrinterStatusRequest.class,
      responseType = distsys.smart_office.SmartOfficeProto.PrinterStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrinterStatusRequest,
      distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> getCheckPrinterStatusMethod() {
    io.grpc.MethodDescriptor<distsys.smart_office.SmartOfficeProto.PrinterStatusRequest, distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> getCheckPrinterStatusMethod;
    if ((getCheckPrinterStatusMethod = PrinterScannerManagementGrpc.getCheckPrinterStatusMethod) == null) {
      synchronized (PrinterScannerManagementGrpc.class) {
        if ((getCheckPrinterStatusMethod = PrinterScannerManagementGrpc.getCheckPrinterStatusMethod) == null) {
          PrinterScannerManagementGrpc.getCheckPrinterStatusMethod = getCheckPrinterStatusMethod =
              io.grpc.MethodDescriptor.<distsys.smart_office.SmartOfficeProto.PrinterStatusRequest, distsys.smart_office.SmartOfficeProto.PrinterStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPrinterStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.PrinterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distsys.smart_office.SmartOfficeProto.PrinterStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrinterScannerManagementMethodDescriptorSupplier("CheckPrinterStatus"))
              .build();
        }
      }
    }
    return getCheckPrinterStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrinterScannerManagementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementStub>() {
        @java.lang.Override
        public PrinterScannerManagementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrinterScannerManagementStub(channel, callOptions);
        }
      };
    return PrinterScannerManagementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrinterScannerManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementBlockingStub>() {
        @java.lang.Override
        public PrinterScannerManagementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrinterScannerManagementBlockingStub(channel, callOptions);
        }
      };
    return PrinterScannerManagementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrinterScannerManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrinterScannerManagementFutureStub>() {
        @java.lang.Override
        public PrinterScannerManagementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrinterScannerManagementFutureStub(channel, callOptions);
        }
      };
    return PrinterScannerManagementFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Printer and scanner
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void printDocument(distsys.smart_office.SmartOfficeProto.PrintRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrintResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrintDocumentMethod(), responseObserver);
    }

    /**
     */
    default void scanDocument(distsys.smart_office.SmartOfficeProto.ScanRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.ScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanDocumentMethod(), responseObserver);
    }

    /**
     */
    default void checkPrinterStatus(distsys.smart_office.SmartOfficeProto.PrinterStatusRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPrinterStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PrinterScannerManagement.
   * <pre>
   * Printer and scanner
   * </pre>
   */
  public static abstract class PrinterScannerManagementImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PrinterScannerManagementGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PrinterScannerManagement.
   * <pre>
   * Printer and scanner
   * </pre>
   */
  public static final class PrinterScannerManagementStub
      extends io.grpc.stub.AbstractAsyncStub<PrinterScannerManagementStub> {
    private PrinterScannerManagementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterScannerManagementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrinterScannerManagementStub(channel, callOptions);
    }

    /**
     */
    public void printDocument(distsys.smart_office.SmartOfficeProto.PrintRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrintResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrintDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scanDocument(distsys.smart_office.SmartOfficeProto.ScanRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.ScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkPrinterStatus(distsys.smart_office.SmartOfficeProto.PrinterStatusRequest request,
        io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPrinterStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PrinterScannerManagement.
   * <pre>
   * Printer and scanner
   * </pre>
   */
  public static final class PrinterScannerManagementBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PrinterScannerManagementBlockingStub> {
    private PrinterScannerManagementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterScannerManagementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrinterScannerManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.PrintResponse printDocument(distsys.smart_office.SmartOfficeProto.PrintRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrintDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.ScanResponse scanDocument(distsys.smart_office.SmartOfficeProto.ScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public distsys.smart_office.SmartOfficeProto.PrinterStatusResponse checkPrinterStatus(distsys.smart_office.SmartOfficeProto.PrinterStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPrinterStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PrinterScannerManagement.
   * <pre>
   * Printer and scanner
   * </pre>
   */
  public static final class PrinterScannerManagementFutureStub
      extends io.grpc.stub.AbstractFutureStub<PrinterScannerManagementFutureStub> {
    private PrinterScannerManagementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterScannerManagementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrinterScannerManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.PrintResponse> printDocument(
        distsys.smart_office.SmartOfficeProto.PrintRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrintDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.ScanResponse> scanDocument(
        distsys.smart_office.SmartOfficeProto.ScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distsys.smart_office.SmartOfficeProto.PrinterStatusResponse> checkPrinterStatus(
        distsys.smart_office.SmartOfficeProto.PrinterStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPrinterStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRINT_DOCUMENT = 0;
  private static final int METHODID_SCAN_DOCUMENT = 1;
  private static final int METHODID_CHECK_PRINTER_STATUS = 2;

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
        case METHODID_PRINT_DOCUMENT:
          serviceImpl.printDocument((distsys.smart_office.SmartOfficeProto.PrintRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrintResponse>) responseObserver);
          break;
        case METHODID_SCAN_DOCUMENT:
          serviceImpl.scanDocument((distsys.smart_office.SmartOfficeProto.ScanRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.ScanResponse>) responseObserver);
          break;
        case METHODID_CHECK_PRINTER_STATUS:
          serviceImpl.checkPrinterStatus((distsys.smart_office.SmartOfficeProto.PrinterStatusRequest) request,
              (io.grpc.stub.StreamObserver<distsys.smart_office.SmartOfficeProto.PrinterStatusResponse>) responseObserver);
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
          getPrintDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.PrintRequest,
              distsys.smart_office.SmartOfficeProto.PrintResponse>(
                service, METHODID_PRINT_DOCUMENT)))
        .addMethod(
          getScanDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.ScanRequest,
              distsys.smart_office.SmartOfficeProto.ScanResponse>(
                service, METHODID_SCAN_DOCUMENT)))
        .addMethod(
          getCheckPrinterStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              distsys.smart_office.SmartOfficeProto.PrinterStatusRequest,
              distsys.smart_office.SmartOfficeProto.PrinterStatusResponse>(
                service, METHODID_CHECK_PRINTER_STATUS)))
        .build();
  }

  private static abstract class PrinterScannerManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrinterScannerManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distsys.smart_office.SmartOfficeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrinterScannerManagement");
    }
  }

  private static final class PrinterScannerManagementFileDescriptorSupplier
      extends PrinterScannerManagementBaseDescriptorSupplier {
    PrinterScannerManagementFileDescriptorSupplier() {}
  }

  private static final class PrinterScannerManagementMethodDescriptorSupplier
      extends PrinterScannerManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrinterScannerManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrinterScannerManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrinterScannerManagementFileDescriptorSupplier())
              .addMethod(getPrintDocumentMethod())
              .addMethod(getScanDocumentMethod())
              .addMethod(getCheckPrinterStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
