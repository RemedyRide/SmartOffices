/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.smart_office;

/**
 *
 * @author anand
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartOfficeGUI extends JFrame {
    private JButton lightOnButton, lightOffButton;
    private JButton bookRoomButton, cancelRoomButton;
    private JButton printButton, scanButton;
    private JTextArea textArea;
    
    private ManagedChannel channel;
    
    // Constructor for the JFrame
    public SmartOfficeGUI() {
        setTitle("Smart Office Control");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Initialize the channel to gRPC server
        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // Disable encryption for testing purposes
                .build();
        
        // Create UI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        
        // Light control
        JPanel lightPanel = new JPanel();
        lightOnButton = new JButton("Turn Light ON");
        lightOffButton = new JButton("Turn Light OFF");
        lightPanel.add(lightOnButton);
        lightPanel.add(lightOffButton);
        
        // Room Booking control
        JPanel roomPanel = new JPanel();
        bookRoomButton = new JButton("Book Meeting Room");
        cancelRoomButton = new JButton("Cancel Room Booking");
        roomPanel.add(bookRoomButton);
        roomPanel.add(cancelRoomButton);
        
        // Printer/Scanner control
        JPanel printerPanel = new JPanel();
        printButton = new JButton("Print Document");
        scanButton = new JButton("Scan Document");
        printerPanel.add(printButton);
        printerPanel.add(scanButton);
        
        // Text Area for output
        textArea = new JTextArea(10, 40);
        textArea.setEditable(false);
        
        // Add components to the main panel
        panel.add(lightPanel);
        panel.add(roomPanel);
        panel.add(printerPanel);
        panel.add(new JScrollPane(textArea));
        
        add(panel);
        
        // Event listeners for buttons
        lightOnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnOnLight("Conference Room");
            }
        });
        
        lightOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                turnOffLight("Conference Room");
            }
        });
        
        bookRoomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bookRoom("Conference Room", "2025-03-10 10:00");
            }
        });
        
        cancelRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelBooking("Conference Room", "2025-03-10 10:00");
            }
        });
        
        printButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printDocument("Document1.pdf", 2);
            }
        });
        
        scanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scanDocument("PDF");
            }
        });
    }

    // Turn ON Light
    private void turnOnLight(String room) {
        LightSwitchGrpc.LightSwitchBlockingStub lightSwitchStub = LightSwitchGrpc.newBlockingStub(channel);
        LightRequest lightRequest = LightRequest.newBuilder().setRoom(room).build();
        LightResponse lightResponse = lightSwitchStub.turnOn(lightRequest);
        textArea.append("Light ON Response: " + lightResponse.getMessage() + "\n");
    }

    // Turn OFF Light
    private void turnOffLight(String room) {
        LightSwitchGrpc.LightSwitchBlockingStub lightSwitchStub = LightSwitchGrpc.newBlockingStub(channel);
        LightRequest lightRequest = LightRequest.newBuilder().setRoom(room).build();
        LightResponse lightResponse = lightSwitchStub.turnOff(lightRequest);
        textArea.append("Light OFF Response: " + lightResponse.getMessage() + "\n");
    }

    // Book Meeting Room
    private void bookRoom(String room, String time) {
        MeetingRoomBookingGrpc.MeetingRoomBookingBlockingStub meetingRoomStub = MeetingRoomBookingGrpc.newBlockingStub(channel);
        BookingRequest bookingRequest = BookingRequest.newBuilder().setRoom(room).setTime(time).build();
        BookingResponse bookingResponse = meetingRoomStub.bookRoom(bookingRequest);
        textArea.append("Room Booking Response: " + bookingResponse.getMessage() + "\n");
    }

    // Cancel Room Booking
    private void cancelBooking(String room, String time) {
        MeetingRoomBookingGrpc.MeetingRoomBookingBlockingStub meetingRoomStub = MeetingRoomBookingGrpc.newBlockingStub(channel);
        BookingRequest bookingRequest = BookingRequest.newBuilder().setRoom(room).setTime(time).build();
        BookingResponse bookingResponse = meetingRoomStub.cancelBooking(bookingRequest);
        textArea.append("Cancel Booking Response: " + bookingResponse.getMessage() + "\n");
    }

    // Print Document
    private void printDocument(String documentName, int copies) {
        PrinterScannerManagementGrpc.PrinterScannerManagementBlockingStub printerScannerStub = PrinterScannerManagementGrpc.newBlockingStub(channel);
        PrintRequest printRequest = PrintRequest.newBuilder().setDocumentName(documentName).setCopies(copies).build();
        PrintResponse printResponse = printerScannerStub.printDocument(printRequest);
        textArea.append("Print Response: " + printResponse.getMessage() + "\n");
    }

    // Scan Document
    private void scanDocument(String format) {
        PrinterScannerManagementGrpc.PrinterScannerManagementBlockingStub printerScannerStub = PrinterScannerManagementGrpc.newBlockingStub(channel);
        ScanRequest scanRequest = ScanRequest.newBuilder().setFormat(format).build();
        ScanResponse scanResponse = printerScannerStub.scanDocument(scanRequest);
        textArea.append("Scan Response: " + scanResponse.getFilePath() + "\n");
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SmartOfficeGUI().setVisible(true);
            }
        });
    }
}
