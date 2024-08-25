import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame1 extends JFrame implements ActionListener {
    Container c = getContentPane();
    JButton b1 = new JButton("LOGIN");
    JButton b2 = new JButton("RESET");
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    int attempt = 3;

    LoginFrame1() {
        c.setLayout(null);

        userLabel.setBounds(50, 150, 100, 30);
        passLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        b1.setBounds(50, 300, 100, 30);
        b2.setBounds(200, 300, 100, 30);

        c.add(userLabel);
        c.add(passLabel);
        c.add(userTextField);
        c.add(passwordField);
        c.add(b1);
        c.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        setSize(720, 480);
    }

    public void reset() {
        userTextField.setText("");
        passwordField.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        String enteredUsername = userTextField.getText();
        String enteredPassword = String.valueOf(passwordField.getPassword());

        if (e.getSource() == b1) {
            if (enteredUsername.equals("Siddhi Satam") && enteredPassword.equals("Marvel3005")) {
                JOptionPane.showMessageDialog(null, "Correct details");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect details, " + attempt + " attempt(s) left");
                reset();
                attempt--;

                if (attempt == -1) {
                    JOptionPane.showMessageDialog(null, "LOGIN FAILED: You cannot login again");
                    b1.setEnabled(false);
                }
            }
        }

        if (e.getSource() == b2) {
            reset();
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        new LoginFrame1();
    }
}
