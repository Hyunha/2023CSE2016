package problem2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class G2048 extends JFrame {
    private JLabel score;
    private Board board;

    public G2048() {
        Container cp  = getContentPane();
        cp.setLayout(new BorderLayout());

        JPanel main = new JPanel(new FlowLayout());
        JPanel game = new JPanel(new BorderLayout());
        score = new JLabel("score = 0");
        main.add(score);
        cp.add(BorderLayout.NORTH, main);
        cp.add(BorderLayout.CENTER, game);

        JButton north = new JButton("^");
        JButton south = new JButton("v");
        JButton west = new JButton("<");
        JButton east = new JButton(">");

        board = new Board(score);

        north.addActionListener(board);
        south.addActionListener(board);
        east.addActionListener(board);
        west.addActionListener(board);

        game.add(north, BorderLayout.NORTH);
        game.add(board, BorderLayout.CENTER);
        game.add(south, BorderLayout.SOUTH);
        game.add(west, BorderLayout.WEST);
        game.add(east, BorderLayout.EAST);

        setTitle("2048");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
