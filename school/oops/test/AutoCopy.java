
import javax.swing.*;
import javax.swing.event.*;
public class AutoCopy extends JFrame {
    public AutoCopy() {
        JTextField t1 = new JTextField(15), t2 = new JTextField(15);
        t2.setEditable(false);
        t1.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { t2.setText(t1.getText()); }
            public void removeUpdate(DocumentEvent e) { t2.setText(t1.getText()); }
            public void changedUpdate(DocumentEvent e) { t2.setText(t1.getText()); }
        });
        add(new JPanel(){{
            add(t1); add(t2);
        }});
        pack(); setDefaultCloseOperation(EXIT_ON_CLOSE); setLocationRelativeTo(null);
    }
    public static void main(String[] args) { new AutoCopy().setVisible(true); }
}
