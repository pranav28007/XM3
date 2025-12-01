
import javax.swing.*;
import java.awt.event.*;

public class LoginApp extends JFrame {
    public LoginApp() {
        JTextField user = new JTextField(10);
        JPasswordField pass = new JPasswordField(10);
        JButton b = new JButton("Login");
        b.addActionListener(e -> {
            String u = user.getText();
            String p = new String(pass.getPassword());
            if ("admin".equals(u) && "password".equals(p)) JOptionPane.showMessageDialog(this, "Valid User");
            else JOptionPane.showMessageDialog(this, "Invalid User");
        });
        JPanel p = new JPanel(); p.add(new JLabel("User:")); p.add(user); p.add(new JLabel("Pass:")); p.add(pass); p.add(b);
        add(p); pack(); setDefaultCloseOperation(EXIT_ON_CLOSE); setLocationRelativeTo(null);
    }

    public static void main(String[] args) { new LoginApp().setVisible(true); }
}
