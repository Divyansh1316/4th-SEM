import java.awt.*;
import java.awt.event.*;

class window1 extends Frame implements ActionListener {
    Label l = new Label("Num 1");
    TextField tf = new TextField(15);
    Label l2 = new Label("Num 2");
    TextField tf2 = new TextField(15);
    Label l3 = new Label("Result");
    TextField tf3 = new TextField(15);
    Button b1 = new Button("Sum");

    window1() {
        add(l);
        add(tf);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int l1 = Integer.parseInt(tf.getText());
        int l2 = Integer.parseInt(tf2.getText());
        int sum = l1 + l2;
        tf3.setText(String.valueOf(sum));
    }
}

public class awt2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        window1 ob = new window1();
    }
}