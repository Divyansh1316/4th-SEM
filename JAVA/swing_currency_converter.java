
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Window1 extends JFrame implements ActionListener {

    String str1[] = { "Rupees", "Dinar", "Pounds", "Euro" };

    JComboBox<String> c1 = new JComboBox<>(str1);

    JComboBox<String> c2 = new JComboBox<>(str1);

    JLabel l1 = new JLabel("Input");
    JTextField tf1 = new JTextField(20);
    JLabel l2 = new JLabel("Result");
    JTextField tf2 = new JTextField(20);
    JButton b1 = new JButton("Convert");
    JButton b2 = new JButton("Reset IP");

    Window1() {
        add(l1);
        add(c1);
        add(tf1);
        add(l2);
        add(c2);
        add(tf2);
        add(b1);
        add(b2);

        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT, 100, 10));
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            String str1 = (String) c1.getSelectedItem();
            String str2 = (String) c2.getSelectedItem();

            double l1 = Double.parseDouble(tf1.getText());
            double convert1 = 0, convert2 = 0, convert3 = 0;

            if (str1.equals("Rupees") && str2.equals("Dinar")) {
                convert1 = l1 * 0.0036;
                tf2.setText(String.valueOf(convert1));
            } else if (str1.equals("Rupees") && str2.equals("Pounds")) {
                convert2 = l1 * 0.0093;
                tf2.setText(String.valueOf(convert2));
            } else if (str1.equals("Rupees") && str2.equals("Euro")) {
                convert3 = l1 * 0.011;
                tf2.setText(String.valueOf(convert3));
            }

            if (str1.equals("Dinar") && str2.equals("Rupees")) {
                convert1 = l1 * 275.22;
                tf2.setText(String.valueOf(convert1));
            } else if (str1.equals("Dinar") && str2.equals("Pounds")) {
                convert2 = l1 * 2.56;
                tf2.setText(String.valueOf(convert2));
            } else if (str1.equals("Dinar") && str2.equals("Euro")) {
                convert3 = l1 * 2.98;
                tf2.setText(String.valueOf(convert3));
            }

            if (str1.equals("Pounds") && str2.equals("Rupees")) {
                convert1 = l1 * 107.35;
                tf2.setText(String.valueOf(convert1));
            } else if (str1.equals("Pounds") && str2.equals("Dinar")) {
                convert2 = l1 * 0.39;
                tf2.setText(String.valueOf(convert2));
            } else if (str1.equals("Pounds") && str2.equals("Euro")) {
                convert3 = l1 * 1.16;
                tf2.setText(String.valueOf(convert3));
            }

            if (str1.equals("Euro") && str2.equals("Rupees")) {
                convert1 = l1 * 92.21;
                tf2.setText(String.valueOf(convert1));
            } else if (str1.equals("Euro") && str2.equals("Dinar")) {
                convert2 = l1 * 0.33;
                tf2.setText(String.valueOf(convert2));
            } else if (str1.equals("Euro") && str2.equals("Pounds")) {
                convert3 = l1 * 0.86;
                tf2.setText(String.valueOf(convert3));
            }

            else if (str1.equals(str2)) {
                tf2.setText(String.valueOf(l1));
            }

        }
        if (e.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
        }
    }
}

public class swing_currency {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Window1 ob = new Window1();
    }
}
