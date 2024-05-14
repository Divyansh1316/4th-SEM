import java.awt.*;
import java.awt.event.*;

class window2 extends Frame implements ActionListener {
    Label l = new Label("Enter string");
    TextField tf = new TextField(15);
    Label l2 = new Label("Result");
    TextField tf2 = new TextField(15);
    Button b1 = new Button("CountVowel");
    Button b2 = new Button("Reset");
    Button b3 = new Button("Exit");
    Label mt = new Label("");
    Label mt2 = new Label("");
    Label mt3 = new Label("                                        ");

    window2() {
        add(l);
        add(tf);
        add(l2);
        add(tf2);
        add(mt3);
        add(b1);
        add(mt);
        add(b2);
        add(mt2);
        add(b3);
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));

        tf.setForeground(Color.BLUE.darker());
        tf2.setForeground(Color.BLUE.darker());
        tf.setFont(new Font("Montserrat", Font.BOLD, 14));
        tf2.setFont(new Font("Montserrat", Font.BOLD, 14));

        l.setForeground(Color.BLUE.darker());
        l2.setForeground(Color.BLUE.darker());
        l.setFont(new Font("Montserrat", Font.BOLD, 20));
        l2.setFont(new Font("Montserrat", Font.BOLD, 20));

        b1.setBackground(Color.blue.darker());
        b2.setBackground(Color.blue.darker());
        b3.setBackground(Color.blue.darker());
        b1.setFont(new Font("Montserrat", Font.BOLD, 18));
        b2.setFont(new Font("Montserrat", Font.BOLD, 18));
        b3.setFont(new Font("Montserrat", Font.BOLD, 18));

        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);

        b1.setFont(new Font("Montserrat", Font.BOLD, 14));
        b2.setFont(new Font("Montserrat", Font.BOLD, 14));
        b3.setFont(new Font("Montserrat", Font.BOLD, 14));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int vowel = 0;
        if (e.getSource() == b1) {
            String str = tf.getText().toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                            || str.charAt(i) == 'U') {
                        vowel++;
                    }
                }
            }
            tf2.setText(String.valueOf(vowel));
        }
        if (e.getSource() == b2) {
            tf.setText("");
            tf2.setText("");
        }
        if (e.getSource() == b3) {
            dispose();
        }
    }
}

public class awt3_formatted {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        window2 ob = new window2();
    }
}