package counter5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorMenuButton extends JButton implements ActionListener {

    Ball ball;

    public ColorMenuButton(String text, Ball b) {
        super(text);
        ball = b;
    }
    public void actionPerformed(ActionEvent e) {
        if ("파랑".equals(getText())) {
            ball.setColor(Color.blue);
        } else if ("노랑".equals(getText())) {
            ball.setColor(Color.yellow);
        } else {
            ball.setColor(Color.red);
        }
    }
}
