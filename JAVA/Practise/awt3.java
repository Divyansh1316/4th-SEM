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

    window2() {
        add(l);
        add(tf);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
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

public class awt3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        window2 ob = new window2();
    }
}