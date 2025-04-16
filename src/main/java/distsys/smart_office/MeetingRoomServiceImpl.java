/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smart_office;

/**
 *
 * @author anand
 */


import distsys.smart_office.SmartOfficeProto.BookingRequest;
import distsys.smart_office.SmartOfficeProto.BookingResponse;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.ConcurrentHashMap;

public class MeetingRoomServiceImpl extends MeetingRoomBookingGrpc.MeetingRoomBookingImplBase {
    private final ConcurrentHashMap<String, String> bookings = new ConcurrentHashMap<>();

    @Override
    public void bookRoom(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
        String room = request.getRoom();
        String timeSlot = request.getTime();

        if (bookings.containsKey(room)) {
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(false)
                .setMessage("Room is already booked for this time slot.")
                .build());
        } else {
            bookings.put(room, timeSlot);
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Room booked successfully for time slot: " + timeSlot)
                .build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void cancelBooking(BookingRequest request, StreamObserver<BookingResponse> responseObserver) {
        String room = request.getRoom();

        if (bookings.containsKey(room)) {
            bookings.remove(room);
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Booking for room '" + room + "' has been cancelled.")
                .build());
        } else {
            responseObserver.onNext(BookingResponse.newBuilder()
                .setSuccess(false)
                .setMessage("No booking found for room '" + room + "'.")
                .build());
        }

        responseObserver.onCompleted();
    }
}


