package simple;

import javax.swing.*;
import java.awt.*;

public class FirstCase extends JFrame {
    public FirstCase() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel label = new JLabel("OK 누르세요!");
        JButton button = new JButton("OK");
        cp.add(label);
        cp.add(button);
        setSize(200, 65);
        setTitle("Button");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FirstCase();

    }
}
