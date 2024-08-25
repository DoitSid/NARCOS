import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CountWord extends JFrame implements ActionListener {
    JScrollPane jpane;
    JTextArea textfl;
    JButton button;
    JLabel ch, words, nch, nwords;

    CountWord() {
        jpane = new JScrollPane();
        jpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        textfl = new JTextArea(10, 10);
        jpane.setViewportView(textfl);

        button = new JButton("Total");
        ch = new JLabel("Character: ");
        words = new JLabel("Words: ");
        nch = new JLabel("0");
        nwords = new JLabel("0");

        words.setBounds(40, 30, 130, 10);
        nwords.setBounds(110, 30, 30, 10);
        ch.setBounds(190, 30, 130, 10);
        nch.setBounds(280, 30, 30, 10);
        button.setBounds(120, 330, 150, 30);
        jpane.setBounds(20, 60, 300, 250);

        add(button);
        add(ch);
        add(nch);
        add(words);
        add(nwords);
        add(jpane);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        nch.setText(String.valueOf((textfl.getText()).length()));
        nwords.setText(String.valueOf(textfl.getText().split("\\s+").length));
    }
}

public class Wordcnt {
    public static void main(String[] args) {
        CountWord cw = new CountWord();
        cw.setLayout(null);

        cw.setSize(480, 480);
        cw.setVisible(true);
        cw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
