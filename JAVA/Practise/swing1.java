import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class windowSw extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Username");
    JTextField tf1 = new JTextField(15);
    JLabel l2 = new JLabel("Password");
    JTextField tf2 = new JTextField(15);
    JButton b1 = new JButton("Login");

    windowSw() {
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
        setSize(400, 300);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String u = "hello";
        String p = "123";
        if (tf1.getText().equals(u) && tf2.getText().equals(p)) {
            JOptionPane.showMessageDialog(this, "Sucess");
            dispose();
        } else {
            // tf3.setText("Try again");
            JOptionPane.showMessageDialog(this, "Try again");
            tf1.setText("");
            tf2.setText("");
        }
    }
}

public class swing1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        windowSw ob = new windowSw();
    }
}