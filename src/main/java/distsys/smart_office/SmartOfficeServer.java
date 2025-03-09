package distsys.smart_office;

import distsys.smart_office.SmartOfficeProto.BookingRequest;
import distsys.smart_office.SmartOfficeProto.BookingResponse;
import distsys.smart_office.SmartOfficeProto.LightRequest;
import distsys.smart_office.SmartOfficeProto.LightResponse;
import distsys.smart_office.SmartOfficeProto.PrintRequest;
import distsys.smart_office.SmartOfficeProto.PrintResponse;
import distsys.smart_office.SmartOfficeProto.PrinterStatusRequest;
import distsys.smart_office.SmartOfficeProto.PrinterStatusResponse;
import distsys.smart_office.SmartOfficeProto.ScanRequest;
import distsys.smart_office.SmartOfficeProto.ScanResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class SmartOfficeServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create the server and bind it to a port (e.g., 50051)
        Server server = ServerBuilder.forPort(50051)
            .addService(new LightSwitchServiceImpl())  // Register LightSwitch service
            .addService(new MeetingRoomBookingServiceImpl())  // Register MeetingRoomBooking service
            .addService(new PrinterScannerManagementServiceImpl())  // Register PrinterScannerManagement service
            .build();

        // Start the server
        System.out.println("Starting Smart Office gRPC server...");
        server.start();

        // Keep the server running
        System.out.println("Server started, listening on port 50051");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down server...");
            server.shutdown();
        }));

        server.awaitTermination();
    }

    // Service implementation for LightSwitch
    public static class LightSwitchServiceImpl extends LightSwitchGrpc.LightSwitchImplBase {

        @Override
        public void turnOn(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            // Logic to turn on the light
            System.out.println("Turning on light in room: " + request.getRoom());

            // Example response
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Light turned on in room " + request.getRoom())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnOff(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            // Logic to turn off the light
            System.out.println("Turning off light in room: " + request.getRoom());

            // Example response
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Light turned off in room " + request.getRoom())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // Service implementation for MeetingRoomBooking
    public static class MeetingRoomBookingServiceImpl extends MeetingRoomBookingGrpc.MeetingRoomBookingImplBase {

        @Override
        public void bookRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
            // Logic to book a meeting room
            System.out.println("Booking room: " + request.getRoom() + " at " + request.getTime());

            // Example response
            BookingResponse response = BookingResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Room " + request.getRoom() + " booked for " + request.getTime())
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void cancelBooking(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
            // Logic to cancel a meeting room booking
            System.out.println("Canceling booking for room: " + request.getRoom() + " at " + request.getTime());

            // Example response
            BookingResponse response = BookingResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Booking for room " + request.getRoom() + " at " + request.getTime() + " has been canceled.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // Service implementation for PrinterScannerManagement
    public static class PrinterScannerManagementServiceImpl extends PrinterScannerManagementGrpc.PrinterScannerManagementImplBase {

        @Override
        public void printDocument(PrintRequest request, StreamObserver<PrintResponse> responseObserver) {
            // Logic for printing the document
            System.out.println("Printing document: " + request.getDocumentName() + " with " + request.getCopies() + " copies.");

            // Example response
            PrintResponse response = PrintResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Document " + request.getDocumentName() + " printed successfully.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void scanDocument(ScanRequest request, StreamObserver<ScanResponse> responseObserver) {
            // Logic for scanning the document
            System.out.println("Scanning document in format: " + request.getFormat());

            // Example response
            ScanResponse response = ScanResponse.newBuilder()
                    .setSuccess(true)
                    .setFilePath("/path/to/scanned/file")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void checkPrinterStatus(PrinterStatusRequest request, StreamObserver<PrinterStatusResponse> responseObserver) {
            // Logic for checking printer status
            System.out.println("Checking printer status...");

            // Example response
            PrinterStatusResponse response = PrinterStatusResponse.newBuilder()
                    .setStatus("Online")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
