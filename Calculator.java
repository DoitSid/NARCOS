import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField textField;
    String s0, s1, s2;

    Calculator() {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[]) {
        frame = new JFrame("Calculator");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Calculator calculator = new Calculator();
        textField = new JTextField(160);
        textField.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        beq1 = new JButton("=");
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");
        be = new JButton(".");
        JPanel panel = new JPanel();
        bm.addActionListener(calculator);
        bd.addActionListener(calculator);
        bs.addActionListener(calculator);
        ba.addActionListener(calculator);
        b9.addActionListener(calculator);
        b8.addActionListener(calculator);
        b7.addActionListener(calculator);
        b6.addActionListener(calculator);
        b5.addActionListener(calculator);
        b4.addActionListener(calculator);
        b3.addActionListener(calculator);
        b2.addActionListener(calculator);
        b1.addActionListener(calculator);
        b0.addActionListener(calculator);
        be.addActionListener(calculator);
        beq.addActionListener(calculator);
        beq1.addActionListener(calculator);

        panel.add(textField);
        panel.add(ba);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bs);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bm);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bd);
        panel.add(be);
        panel.add(b0);
        panel.add(beq);
        panel.add(beq1);
        panel.setBackground(Color.blue);
        frame.add(panel);
        frame.setSize(2000, 2200);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            textField.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            textField.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == '=') {
            double result;
            if (s1.equals("+"))
                result = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                result = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                result = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                result = (Double.parseDouble(s0) * Double.parseDouble(s2));
            textField.setText(s0 + s1 + s2 + "=" + result);
            s0 = Double.toString(result);
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double result;
                if (s1.equals("+"))
                    result = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    result = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    result = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    result = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(result);
                s1 = s;
                s2 = "";
            }
            textField.setText(s0 + s1 + s2);
        }
    }
}
