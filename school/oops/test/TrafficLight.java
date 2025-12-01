
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {
    JRadioButton red, yellow, green;
    ButtonGroup bg;

    TrafficLight() {
        setTitle("Traffic Light");
        setSize(300, 300);
        setLayout(new FlowLayout());

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        add(red);
        add(yellow);
        add(green);

        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (red.isSelected()) {
            getContentPane().setBackground(Color.RED);
        }
        else if (yellow.isSelected()) {
            getContentPane().setBackground(Color.YELLOW);
        }
        else if (green.isSelected()) {
            getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}
