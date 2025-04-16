import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class SmartOfficeGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JPanel mainPanel;

    private String jwtToken = null;

    private int loginAttempts = 0;
    private final int MAX_ATTEMPTS = 3;
    private final int LOCKOUT_TIME = 30000;

    public SmartOfficeGUI() {
        setTitle("Smart Office Control");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        add(cardPanel);

        JPanel loginPanel = createLoginPanel();
        JPanel mainAppPanel = createMainAppPanel();

        cardPanel.add(loginPanel, "Login");
        cardPanel.add(mainAppPanel, "Main");

        cardLayout.show(cardPanel, "Login");
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("");

        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);
        panel.add(new JLabel());
        panel.add(statusLabel);

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if (loginAttempts >= MAX_ATTEMPTS) {
                statusLabel.setText("Too many attempts. Please wait...");
                return;
            }

            boolean isEmailValid = isValidEmail(email);
            boolean isPasswordEmpty = password.isEmpty();

            if (!isEmailValid || isPasswordEmpty) {
                loginAttempts++;
                int remainingAttempts = MAX_ATTEMPTS - loginAttempts;

                if (!isEmailValid) {
                    statusLabel.setText("Invalid email. Attempt " + loginAttempts + " of " + MAX_ATTEMPTS);
                } else {
                    statusLabel.setText("Password required. Attempt " + loginAttempts + " of " + MAX_ATTEMPTS);
                }

                if (loginAttempts >= MAX_ATTEMPTS) {
                    statusLabel.setText("Too many failed attempts. Locked for 30 seconds.");
                    loginButton.setEnabled(false);

                    new Timer(LOCKOUT_TIME, e1 -> {
                        loginAttempts = 0;
                        loginButton.setEnabled(true);
                        statusLabel.setText("You can try logging in again.");
                    }).start();
                }

                return;
            }

            // Success
            jwtToken = "mock-jwt-token-for-" + email;
            System.out.println("Login successful. JWT: " + jwtToken);
            loginAttempts = 0;
            statusLabel.setText("");
            cardLayout.show(cardPanel, "Main");
        });

        return panel;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(emailRegex, email);
    }

    private JPanel createMainAppPanel() {
        JPanel container = new JPanel(new BorderLayout());

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JButton lightSwitchButton = new JButton("Light Switch Service");
        JButton bookingButton = new JButton("Meeting Room Booking");
        JButton printerScannerButton = new JButton("Printer/Scanner Management");

        mainPanel.add(lightSwitchButton);
        mainPanel.add(bookingButton);
        mainPanel.add(printerScannerButton);

        JPanel servicesPanel = new JPanel(new CardLayout());

        JPanel lightSwitchPanel = createLightSwitchPanel();
        JPanel bookingPanel = createBookingPanel();
        JPanel printerScannerPanel = createPrinterScannerPanel();

        servicesPanel.add(lightSwitchPanel, "LightSwitch");
        servicesPanel.add(bookingPanel, "Booking");
        servicesPanel.add(printerScannerPanel, "PrinterScanner");

        lightSwitchButton.addActionListener(e -> ((CardLayout) servicesPanel.getLayout()).show(servicesPanel, "LightSwitch"));
        bookingButton.addActionListener(e -> ((CardLayout) servicesPanel.getLayout()).show(servicesPanel, "Booking"));
        printerScannerButton.addActionListener(e -> ((CardLayout) servicesPanel.getLayout()).show(servicesPanel, "PrinterScanner"));

        container.add(mainPanel, BorderLayout.NORTH);
        container.add(servicesPanel, BorderLayout.CENTER);

        return container;
    }

    private JPanel createLightSwitchPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2));

        JTextField roomField = new JTextField();
        JButton turnOnButton = new JButton("Turn On Light");
        JButton turnOffButton = new JButton("Turn Off Light");

        turnOnButton.addActionListener(e -> {
            String room = roomField.getText();
            if (!room.isEmpty()) {
                System.out.println("Turning on light for " + room);
            }
        });

        turnOffButton.addActionListener(e -> {
            String room = roomField.getText();
            if (!room.isEmpty()) {
                System.out.println("Turning off light for " + room);
            }
        });

        panel.add(new JLabel("Enter Room:"));
        panel.add(roomField);
        panel.add(turnOnButton);
        panel.add(turnOffButton);

        return panel;
    }

    private JPanel createBookingPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JTextField roomField = new JTextField();
        JTextField timeField = new JTextField();
        JButton bookButton = new JButton("Book Room");
        JButton cancelButton = new JButton("Cancel Booking");

        bookButton.addActionListener(e -> {
            String room = roomField.getText();
            String time = timeField.getText();
            if (!room.isEmpty() && !time.isEmpty()) {
                System.out.println("Booking room " + room + " at " + time);
            }
        });

        cancelButton.addActionListener(e -> {
            String room = roomField.getText();
            String time = timeField.getText();
            if (!room.isEmpty() && !time.isEmpty()) {
                System.out.println("Canceling booking for room " + room + " at " + time);
            }
        });

        panel.add(new JLabel("Enter Room:"));
        panel.add(roomField);
        panel.add(new JLabel("Enter Time:"));
        panel.add(timeField);
        panel.add(bookButton);
        panel.add(cancelButton);

        return panel;
    }

    private JPanel createPrinterScannerPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JTextField documentField = new JTextField();
        JTextField copiesField = new JTextField();
        JButton printButton = new JButton("Print Document");
        JButton scanButton = new JButton("Scan Document");

        printButton.addActionListener(e -> {
            String document = documentField.getText();
            String copies = copiesField.getText();
            if (!document.isEmpty() && !copies.isEmpty()) {
                System.out.println("Printing document: " + document + " with " + copies + " copies.");
            }
        });

        scanButton.addActionListener(e -> {
            String document = documentField.getText();
            String format = copiesField.getText();
            if (!document.isEmpty() && !format.isEmpty()) {
                System.out.println("Scanning document: " + document + " in format " + format);
            }
        });

        panel.add(new JLabel("Enter Document Name:"));
        panel.add(documentField);
        panel.add(new JLabel("Enter Copies / Format:"));
        panel.add(copiesField);
        panel.add(printButton);
        panel.add(scanButton);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmartOfficeGUI frame = new SmartOfficeGUI();
            frame.setVisible(true);
        });
    }
}