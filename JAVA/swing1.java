
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Window1 extends JFrame implements ActionListener {

    String str1[] = {"Rupees", "Dinar", "Pounds", "Euro"};

    JComboBox c1 = new JComboBox(str1);

    JComboBox c2 = new JComboBox(str1);

    JLabel l1 = new JLabel("Input $");
    JTextField tf1 = new JTextField(20);
    JLabel l2 = new JLabel("Result");
    JTextField tf2 = new JTextField(20);
    JLabel l3 = new JLabel("                                                                                          ");
    JButton b1 = new JButton("Convert");

    JButton b2 = new JButton("Reset IP");

    Window1() {
        add(l1);
        add(c1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(c2);
        add(b1);
        add(b2);

        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String str1=(String)c1.getSelectedItem();
            
            String str2=(String)c2.getSelectedItem();

            float l1 = Float.parseFloat(tf1.getText());
            // tf2.setText(String.valueOf(sum));

            switch (str1) {
                case "Rupees" :
                    float convert1=(float) (l1*0.012);
                    break;
                case "Rupees" :
                    float convert1=(float) (l1*0.012);
                    break;
                case "Rupees" :
                    float convert1=(float) (l1*0.012);
                    break;
                case "Rupees" :
                    float convert1=(float) (l1*0.012);
                    break;
                default:
                    throw new AssertionError();
            }

        }
        if (e.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
            tf2.setBackground(Color.WHITE);
        }
    }
}

public class swing1 {

    public static void main(String[] args) {
        Window1 ob = new Window1();
    }
}
