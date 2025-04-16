import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.regex.Pattern;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SmartOfficeGUI extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private String jwtToken = null;

    private int loginAttempts = 0;
    private final int MAX_ATTEMPTS = 3;

    private final Set<String> availableRooms = new TreeSet<>();
    private final Set<String> bookedRooms = new TreeSet<>();

    public SmartOfficeGUI() {
        setTitle("Smart Office Control");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        add(cardPanel);

        populateRooms();

        cardPanel.add(createLoginPanel(), "Login");
        cardPanel.add(createMainAppPanel(), "Main");

        cardLayout.show(cardPanel, "Login");
    }

    private void populateRooms() {
        for (int i = 100; i <= 400; i += 100) {
            for (int j = i; j <= i + 10; j++) {
                availableRooms.add(String.valueOf(j));
            }
        }
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("");

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);
        panel.add(new JLabel());
        panel.add(statusLabel);

        loginButton.addActionListener(e -> {
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());

            boolean isValid = true;

            if (!isValidEmail(email)) {
                statusLabel.setText("Invalid email.");
                isValid = false;
            } else if (password.isEmpty()) {
                statusLabel.setText("Password cannot be empty.");
                isValid = false;
            }

            if (!isValid) {
                loginAttempts++;
                if (loginAttempts >= MAX_ATTEMPTS) {
                    statusLabel.setText("Too many attempts. Login disabled.");
                    loginButton.setEnabled(false);
                } else {
                    statusLabel.setText(statusLabel.getText() + " Attempt " + loginAttempts + "/" + MAX_ATTEMPTS);
                }
                return;
            }

            // Successful login
            jwtToken = "mock-jwt-token-for-" + email;
            System.out.println("Login successful. JWT: " + jwtToken);
            loginAttempts = 0;
            cardLayout.show(cardPanel, "Main");
        });

        return panel;
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    private JPanel createMainAppPanel() {
        JPanel container = new JPanel(new BorderLayout());

        JPanel topButtons = new JPanel();
        JButton lightBtn = new JButton("Smart Light");
        JButton meetingBtn = new JButton("Meeting Room Booking");
        JButton printerBtn = new JButton("Printer/Scanner");

        topButtons.add(lightBtn);
        topButtons.add(meetingBtn);
        topButtons.add(printerBtn);

        JPanel contentPanel = new JPanel(new CardLayout());

        contentPanel.add(createLightPanel(), "Light");
        contentPanel.add(createMeetingPanel(), "Meeting");
        contentPanel.add(createPrinterPanel(), "Printer");

        lightBtn.addActionListener(e -> switchPanel(contentPanel, "Light"));
        meetingBtn.addActionListener(e -> switchPanel(contentPanel, "Meeting"));
        printerBtn.addActionListener(e -> switchPanel(contentPanel, "Printer"));

        container.add(topButtons, BorderLayout.NORTH);
        container.add(contentPanel, BorderLayout.CENTER);

        return container;
    }

    private void switchPanel(JPanel panel, String name) {
        CardLayout cl = (CardLayout) panel.getLayout();
        cl.show(panel, name);
    }

    private JPanel createLightPanel() {
        BackgroundPanel panel = new BackgroundPanel("resources/images/smartLights.jpg");
        panel.setLayout(new GridLayout(2, 2, 10, 10));

        JTextField roomField = new JTextField();
        JButton onBtn = new JButton("Turn On");
        JButton offBtn = new JButton("Turn Off");

        onBtn.addActionListener(e -> {
            String room = roomField.getText();
            if (!room.isEmpty()) System.out.println("Turning ON light in room: " + room);
        });

        offBtn.addActionListener(e -> {
            String room = roomField.getText();
            if (!room.isEmpty()) System.out.println("Turning OFF light in room: " + room);
        });

        panel.add(new JLabel("Room Number:"));
        panel.add(roomField);
        panel.add(onBtn);
        panel.add(offBtn);

        return panel;
    }

    private JPanel createMeetingPanel() {
        BackgroundPanel panel = new BackgroundPanel("/resources/images/meetingRoom.jpg");
        panel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        JTextField roomField = new JTextField();
        JTextField timeField = new JTextField();
        JButton bookBtn = new JButton("Book");
        JButton discoverBtn = new JButton("Discover Rooms");

        JTextArea outputArea = new JTextArea(8, 30);
        outputArea.setEditable(false);

        inputPanel.add(new JLabel("Room Number:"));
        inputPanel.add(roomField);
        inputPanel.add(new JLabel("Time:"));
        inputPanel.add(timeField);
        inputPanel.add(bookBtn);
        inputPanel.add(discoverBtn);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        bookBtn.addActionListener(e -> {
            String room = roomField.getText().trim();
            String time = timeField.getText().trim();

            if (room.isEmpty() || time.isEmpty()) {
                outputArea.append("Please enter room and time.\n");
                return;
            }

            if (!availableRooms.contains(room)) {
                outputArea.append("Room " + room + " is already booked or invalid.\n");
            } else {
                availableRooms.remove(room);
                bookedRooms.add(room);
                outputArea.append("Room " + room + " booked at " + time + ".\n");
            }
        });

        discoverBtn.addActionListener(e -> {
            outputArea.append("Available Rooms: " + availableRooms + "\n");
            outputArea.append("Booked Rooms: " + bookedRooms + "\n");
        });

        return panel;
    }

    private JPanel createPrinterPanel() {
        BackgroundPanel panel = new BackgroundPanel("resources/images/printer.jpg");
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JTextField docField = new JTextField();
        JTextField copiesField = new JTextField();
        JButton printBtn = new JButton("Print");
        JButton scanBtn = new JButton("Scan");

        printBtn.addActionListener(e -> {
            String doc = docField.getText();
            String copies = copiesField.getText();
            if (!doc.isEmpty() && !copies.isEmpty()) {
                System.out.println("Printing " + doc + " x" + copies);
            }
        });

        scanBtn.addActionListener(e -> {
            String doc = docField.getText();
            String format = copiesField.getText();
            if (!doc.isEmpty() && !format.isEmpty()) {
                System.out.println("Scanning " + doc + " as " + format);
            }
        });

        panel.add(new JLabel("Document:"));
        panel.add(docField);
        panel.add(new JLabel("Copies/Format:"));
        panel.add(copiesField);
        panel.add(printBtn);
        panel.add(scanBtn);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SmartOfficeGUI().setVisible(true);
        });
    }
}

// Custom BackgroundPanel class that loads images from filesystem
class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String imagePath) {
        try {
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.err.println("Image file not found at: " + imageFile.getAbsolutePath());
            }
            backgroundImage = ImageIO.read(imageFile);
            System.out.println("Loaded image from: " + imageFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to load background image: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.RED);
            g.drawString("Image not loaded", 10, 20);
        }
    }
}