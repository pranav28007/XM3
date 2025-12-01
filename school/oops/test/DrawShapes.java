
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawShapes extends JFrame implements ItemListener {

    Checkbox line, rectangle, oval;
    String shape = "";

    DrawShapes() {
        setTitle("Draw Shapes");
        setSize(400, 400);
        setLayout(new FlowLayout());

        line = new Checkbox("Line");
        rectangle = new Checkbox("Rectangle");
        oval = new Checkbox("Oval");

        add(line);
        add(rectangle);
        add(oval);

        line.addItemListener(this);
        rectangle.addItemListener(this);
        oval.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        shape = ((Checkbox)e.getSource()).getLabel();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        if (shape.equals("Line")) {
            g.drawLine(100, 150, 300, 150);
        }
        else if (shape.equals("Rectangle")) {
            g.drawRect(100, 120, 200, 100);
        }
        else if (shape.equals("Oval")) {
            g.drawOval(100, 120, 200, 100);
        }
    }

    public static void main(String[] args) {
        new DrawShapes();
    }
}
