package Codes.Intermediate.Swing;
import javax.swing.*;
import java.awt.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(400,300);
        f.setLayout(new FlowLayout()); //centre aligns

        JLabel l1 = new JLabel("User name : ");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2 = new JLabel("Password : ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton b = new JButton("Submit");
        f.add(b);
    }
}
