package counter3;

import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame {
    private Counter count;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) {
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.add(new CountButton("OK", count, this));
        setTitle("Counter");
        setSize(200, 60);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        label.setText("count = " + count.countOf());
    }
}
