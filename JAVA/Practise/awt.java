import java.awt.*;
import java.awt.event.*;;

class window extends Frame implements ActionListener {
    Label l = new Label("Name");
    TextField tf = new TextField(15);
    Button b1 = new Button("Click me");
    Button b2 = new Button("Click me");

    window() {
        add(l);
        add(tf);
        add(b1);
        add(b2);
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            tf.setText("Aryan");
            setBackground(Color.green);
        }
        if (e.getSource() == b2) {
            tf.setText("Divyansh");
            setBackground(Color.red);
        }
    }
}

public class awt {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        window ob = new window();
    }
}