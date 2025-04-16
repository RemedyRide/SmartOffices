package distsys.smart_office;

import io.grpc.stub.StreamObserver;
import java.util.concurrent.atomic.AtomicBoolean;
import distsys.smart_office.SmartOfficeProto.PrintRequest;
import distsys.smart_office.SmartOfficeProto.PrintResponse;
import distsys.smart_office.SmartOfficeProto.ScanRequest;
import distsys.smart_office.SmartOfficeProto.ScanResponse;
import distsys.smart_office.SmartOfficeProto.PrinterStatusRequest;
import distsys.smart_office.SmartOfficeProto.PrinterStatusResponse;

public class PrinterScannerServiceImpl extends PrinterScannerManagementGrpc.PrinterScannerManagementImplBase {
    private final AtomicBoolean printerOnline = new AtomicBoolean(true); // Simulating printer status

    @Override
    public void printDocument(PrintRequest request, StreamObserver<PrintResponse> responseObserver) {
        String documentName = request.getDocumentName();
        int numCopies = request.getCopies(); // Correct field name from .proto

        if (!printerOnline.get()) {
            responseObserver.onNext(PrintResponse.newBuilder()
                .setSuccess(false)
                .setMessage("Printer is offline. Cannot print.")
                .build());
        } else {
            System.out.println("Printing " + numCopies + " copies of: " + documentName);

            responseObserver.onNext(PrintResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Printed " + numCopies + " copies of: " + documentName)
                .build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void scanDocument(ScanRequest request, StreamObserver<ScanResponse> responseObserver) {
        String format = request.getFormat();
        String filePath = "/scans/document_" + System.currentTimeMillis() + "." + format.toLowerCase();

        System.out.println("Scanning document in format: " + format);

        responseObserver.onNext(ScanResponse.newBuilder()
            .setSuccess(true)
            .setFilePath(filePath)
            .build());

        responseObserver.onCompleted();
    }

    @Override
    public void checkPrinterStatus(PrinterStatusRequest request, StreamObserver<PrinterStatusResponse> responseObserver) {
        String status = printerOnline.get() ? "Online" : "Offline";

        System.out.println("Checking printer status: " + status);

        responseObserver.onNext(PrinterStatusResponse.newBuilder()
            .setStatus(status)
            .build());

        responseObserver.onCompleted();
    }
}
