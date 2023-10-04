import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas");
        frame.setSize(300, 200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.cyan);
        g.drawOval(100, 60, 50, 50);
        g.setColor(Color.blue);
        g.drawRect(100, 60, 90, 60);
    }

    // test code
    public static void main(String[] args) {
        new Canvas();
    }
}