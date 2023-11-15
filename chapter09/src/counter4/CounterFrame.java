package counter4;

import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame {
    private Counter count;
    private JLabel label = new JLabel("count = 0");
    private JPanel drawing;

    public CounterFrame(Counter c, JPanel panel) {
        count = c;
        drawing = panel;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel p1 = new JPanel((new FlowLayout()));
        JPanel p2 = new JPanel((new FlowLayout()));

        p1.add(label);
        p2.add(new CountButton("OK", count, this));
        p2.add(new ExitButton("Exit"));

        cp.add(p1, BorderLayout.NORTH);
        cp.add(drawing, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);

        setTitle("Counter");
        setSize(200, 280);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void update() {
        label.setText("count = " + count.countOf());
        drawing.repaint();
    }
}
