
import javax.swing.*;
import java.awt.event.*;

public class FactorialUI extends JFrame {
    private JTextField in = new JTextField(10);
    private JTextField out = new JTextField(15);
    private JButton compute = new JButton("Compute");

    public FactorialUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.add(new JLabel("n:")); p.add(in);
        p.add(compute);
        p.add(new JLabel("Factorial:")); p.add(out);
        out.setEditable(false);
        compute.addActionListener(e -> {
            try {
                int n = Integer.parseInt(in.getText().trim());
                if (n < 0) out.setText("Undefined");
                else {
                    java.math.BigInteger res = java.math.BigInteger.ONE;
                    for (int i=2;i<=n;i++) res = res.multiply(java.math.BigInteger.valueOf(i));
                    out.setText(res.toString());
                }
            } catch (NumberFormatException ex) { out.setText("Invalid int"); }
        });
        add(p);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) { new FactorialUI().setVisible(true); }
}
