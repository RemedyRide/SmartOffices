import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class SmartOfficeLogin extends JFrame {
    private static final int MAX_ATTEMPTS = 3;

    private int loginAttempts = 0;
    private String jwtToken = null;

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public SmartOfficeLogin() {
        setTitle("Smart Office Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        emailField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);

        loginButton.addActionListener(e -> handleLogin());
    }

    private void handleLogin() {
        if (!loginButton.isEnabled()) {
            return;
        }

        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());

        // Check if email is valid
        if (!isValidEmail(email) || password.isEmpty()) {
            loginAttempts++;
            if (loginAttempts >= MAX_ATTEMPTS) {
                JOptionPane.showMessageDialog(this, "Too many failed attempts. Please try again later.");
                loginButton.setEnabled(false);  // Disable the button after max attempts
            } else {
                int remaining = MAX_ATTEMPTS - loginAttempts;
                JOptionPane.showMessageDialog(this, "Invalid email or password. Attempts remaining: " + remaining);
            }
            return;
        }

        // Reset login attempts on successful login
        loginAttempts = 0;

        // Simulate issuing a JWT token
        jwtToken = "mock-jwt-for-" + email;

        // Open Smart Office GUI
        showMainGUI();
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    private void showMainGUI() {
        SwingUtilities.invokeLater(() -> {
            SmartOfficeGUI mainGUI = new SmartOfficeGUI();
            mainGUI.setVisible(true);
            this.dispose();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SmartOfficeLogin login = new SmartOfficeLogin();
            login.setVisible(true);
        });
    }
}
