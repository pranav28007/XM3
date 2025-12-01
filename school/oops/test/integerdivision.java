
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class integerdivision  extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton divide;

    Week10() {
        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        divide = new JButton("Divide");
        divide.addActionListener(this);

        add(new JLabel("Number 1: "));
        add(t1);
        add(new JLabel("Number 2: "));
        add(t2);
        add(divide);
        add(new JLabel("Result: "));
        add(t3);

        setSize(250, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int result = a / b;
            t3.setText(String.valueOf(result));
        }
        catch (ArithmeticException ex) {
            t3.setText("Cannot divide by zero!");
        }
        catch (NumberFormatException ex) {
            t3.setText("Enter valid integers!");
        }
        finally {
            System.out.println("Division Attempted!");
        }
    }

    public static void main(String[] args) {
        new integerdivision();
    }
}
