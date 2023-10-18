package skeleton;

import javax.swing.*;
import java.awt.*;

public class Archery extends JPanel {
    private final int RINGS = 10; // 원의 개수
    private final int TARGET_DIAMETER;

    /** Constructor Archery - 양궁 과녁 패널을 만들고 프레임에 넣음
     * @param d 과녁의 직경 */
    public Archery(int d) {
        TARGET_DIAMETER = d;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("양궁 과녁");
        f.setSize(TARGET_DIAMETER, TARGET_DIAMETER + 28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** paintComponent - 패널에 그림을 그림
     * @param g 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0,  0, TARGET_DIAMETER, TARGET_DIAMETER);
        final int OFFSET = TARGET_DIAMETER / RINGS;
        int number = 1;
        int diameter = TARGET_DIAMETER;
        int new_x_position = 0;
        int new_y_position = 0;
        while (number <= RINGS) {
            // loop invariant (루프 불변 성질): 지금까지 number-1 개의 링을 그렸음
            if (number <= 2) {
                // case for number is 1 or 2
                g.setColor(Color.white);
                g.fillOval(new_x_position, new_y_position, diameter, diameter);
                g.setColor(Color.gray);
                g.drawOval(new_x_position, new_y_position, diameter, diameter);
            } else if (number <= 4) {
                // case for number is 3 or 4
            } else if (number <= 6) {
                // case for number is 5 or 6
            } else if (number <= 8) {
                // case for number is 7 or 8
            } else if (number <= 10) {
                // case for number is 9 or 10
            }
            new_x_position = 0; // new x position is?
            new_y_position = 0; // new y position is?
            number += 1;
            diameter = 0;       // new diameter is?
        }
    }

    public static void main(String[] args) {
        new Archery(400);
    }
}
