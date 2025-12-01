import java.awt.*;
import java.awt.event.*;

class mo extends Frame {
    String msg = "No Event";

    mo() {
        setSize(300, 300);
        setTitle("Mouse game");

        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                msg = "Mouse Clicked";
                repaint();
            }

            public void mousePressed(MouseEvent e) {
                msg = "Mouse Pressed";
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                msg = "Mouse Released";
                repaint();
            }

            public void mouseEntered(MouseEvent e) {
                msg = "Mouse Entered";
                repaint();
            }

            public void mouseExited(MouseEvent e) {
                msg = "Mouse Exited";
                repaint();
            }

        });
setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 50);
    }
}

public class mouse {
    public static void main(String args[]) {
        new mo();
    }
}
