package chess;

import javax.swing.*;
import java.awt.*;

public class ChessBoardWriter extends JPanel {
    private int number_of_rows;
    private int square_size;
    private int panel_width;
    private int offset = 20;

    /** Constructor ChessBoardWriter 패널을 만들고 프레임을 씌움
     * @param rows 각 열별 칸의 갯수
     * @param size 한 칸의 길이  */
    public ChessBoardWriter(int rows, int size) {
        number_of_rows = rows;
        square_size = size;
        panel_width = number_of_rows * square_size + 2 * offset;

        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Chess Board");
        f.setSize(panel_width, panel_width + 28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /** paintComponent - 패널에 그림을 그림
     * @param g - 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0,  0, panel_width, panel_width);
        paintBoard(offset, offset, number_of_rows, square_size, g);
    }

    /** paintBoard 체스보드를 그림
     * @param start_x 체스보드의 좌상단 구석의 x 좌표
     * @param start_y 체스보드의 좌상단 구석의 y 좌표
     * @param rows 체스보드 열의 갯수
     * @param size 체스보드 칸의 너비
     * @param g 그래픽스 펜 */
    private void paintBoard(int start_x, int start_y,
                            int rows, int size, Graphics g) {
        for (int x = 0; x < rows; x = x + 1) {
            // loop invariant: x열까지 그렸음 (x 증가 전)
            int x_position = start_x + x * size;
            for (int y = 0; y < rows; y = y + 1) {
                // loop invariant: x열의 y칸까지 그렸음 (x 증가 후, y 증가 전)
                int y_position = start_y + y * size;
                if ((x + y) % 2 == 0) // 검은색 칠할 차례
                    g.setColor(Color.black);
                else
                    g.setColor(Color.white);
                g.fillRect(x_position, y_position, size, size);
            }
        }
    }

    public static void main(String[] args) {
        new ChessBoardWriter(8, 40);
    }
}
