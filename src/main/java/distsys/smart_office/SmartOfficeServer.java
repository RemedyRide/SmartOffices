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

        // Await server termination with a timeout
        server.awaitTermination();
    }

    // Service implementation for LightSwitch
    public static class LightSwitchServiceImpl extends LightSwitchGrpc.LightSwitchImplBase {

        @Override
        public void turnOn(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            String room = request.getRoom(); // Get room from request

            // Check if room is valid (e.g., non-empty)
            if (room == null || room.isEmpty()) {
                responseObserver.onError(new IllegalArgumentException("Room cannot be empty"));
                return;
            }

            // Logic to turn on the light
            System.out.println("Turning on light in room: " + room);

            // Example response
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Light turned on in room " + room)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnOff(LightRequest request, StreamObserver<LightResponse> responseObserver) {
            String room = request.getRoom(); // Get room from request

            // Check if room is valid (e.g., non-empty)
            if (room == null || room.isEmpty()) {
                responseObserver.onError(new IllegalArgumentException("Room cannot be empty"));
                return;
            }

            // Logic to turn off the light
            System.out.println("Turning off light in room: " + room);

            // Example response
            LightResponse response = LightResponse.newBuilder()
                    .setMessage("Light turned off in room " + room)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // Service implementation for MeetingRoomBooking
    public static class MeetingRoomBookingServiceImpl extends MeetingRoomBookingGrpc.MeetingRoomBookingImplBase {

        @Override
        public void bookRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
            String room = request.getRoom();  // Get room from request
            String time = request.getTime();  // Get time from request

            // Check if room or time is invalid
            if (room == null || room.isEmpty() || time == null || time.isEmpty()) {
                responseObserver.onError(new IllegalArgumentException("Room and time cannot be empty"));
                return;
            }

            // Logic to book a meeting room
            System.out.println("Booking room: " + room + " at " + time);

            // Example response
            BookingResponse response = BookingResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Room " + room + " booked for " + time)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void cancelBooking(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
            String room = request.getRoom();  // Get room from request
            String time = request.getTime();  // Get time from request

            // Logic to cancel a meeting room booking
            System.out.println("Canceling booking for room: " + room + " at " + time);

            // Example response
            BookingResponse response = BookingResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Booking for room " + room + " at " + time + " has been canceled.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    // Service implementation for PrinterScannerManagement
    public static class PrinterScannerManagementServiceImpl extends PrinterScannerManagementGrpc.PrinterScannerManagementImplBase {

        @Override
        public void printDocument(PrintRequest request, StreamObserver<PrintResponse> responseObserver) {
            String documentName = request.getDocumentName();  // Get document name
            int copies = request.getCopies();  // Get number of copies

            // Check if document name is empty
            if (documentName == null || documentName.isEmpty()) {
                responseObserver.onError(new IllegalArgumentException("Document name cannot be empty"));
                return;
            }

            // Logic for printing the document
            System.out.println("Printing document: " + documentName + " with " + copies + " copies.");

            // Example response
            PrintResponse response = PrintResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Document " + documentName + " printed successfully.")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void scanDocument(ScanRequest request, StreamObserver<ScanResponse> responseObserver) {
            String format = request.getFormat();  // Get the format

            // Check if format is valid
            if (format == null || format.isEmpty()) {
                responseObserver.onError(new IllegalArgumentException("Format cannot be empty"));
                return;
            }

            // Logic for scanning the document
            System.out.println("Scanning document in format: " + format);

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
