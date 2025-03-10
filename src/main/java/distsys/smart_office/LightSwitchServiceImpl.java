package distsys.smart_office;

import io.grpc.stub.StreamObserver;
import distsys.smart_office.SmartOfficeProto.LightRequest;
import distsys.smart_office.SmartOfficeProto.LightResponse;

public class LightSwitchServiceImpl extends LightSwitchGrpc.LightSwitchImplBase {

    @Override
    public void turnOn(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        // Get room from request
        String room = request.getRoom();
        
        // Implement the logic for turning on the light
        System.out.println("Turning on the light in room: " + room);

        // Create a response message
        LightResponse response = LightResponse.newBuilder()
            .setMessage("Light turned on in room: " + room)
            .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void turnOff(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        // Get room from request
        String room = request.getRoom();

        // Implement the logic for turning off the light
        System.out.println("Turning off the light in room: " + room);

        // Create a response message
        LightResponse response = LightResponse.newBuilder()
            .setMessage("Light turned off in room: " + room)
            .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
