/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smart_office;

/**
 *
 * @author anand
 */


import io.grpc.stub.StreamObserver;
import distsys.smart_office.SmartOfficeProto.LightRequest;
import distsys.smart_office.SmartOfficeProto.LightResponse;

public class LightSwitchServiceImpl extends LightSwitchGrpc.LightSwitchImplBase {

    @Override
    public void turnOn(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        // Implement the logic for turning on the light
        System.out.println("Turning on the light");

        // Create a response message
        LightResponse response = LightResponse.newBuilder()
            .setStatus("Light turned on")
            .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void turnOff(LightRequest request, StreamObserver<LightResponse> responseObserver) {
        // Implement the logic for turning off the light
        System.out.println("Turning off the light");

        // Create a response message
        LightResponse response = LightResponse.newBuilder()
            .setStatus("Light turned off")
            .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

