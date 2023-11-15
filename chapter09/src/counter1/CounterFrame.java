package counter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame implements ActionListener {
    private Counter count;
    private JLabel label = new JLabel("count = 0");

    public CounterFrame(Counter c) {
        count = c;
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(label);
        JButton button = new JButton("OK");
        cp.add(button);
        button.addActionListener(this);
        setTitle("Counter");
        setSize(200, 60);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * actionPerformed '버튼 누르기' 액션 이벤트를 처리
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        count.increment();
        label.setText("count = " + count.countOf());
    }
}
