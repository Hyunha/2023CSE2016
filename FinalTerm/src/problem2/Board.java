package problem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Board extends JPanel implements ActionListener {
    private Piece[][] puzzle_board;
    private Random rand;
    private JLabel score;

    public Board(JLabel s) {
        score = s;
        rand = new Random();
        puzzle_board = new Piece[4][4];

        setLayout(new GridLayout(4,4));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Piece p = new Piece("");
                puzzle_board[i][j] = p;
                add(p);
            }
        }

        // 초반에 2개 채워 넣기
        randomFill();
        randomFill();
        s.setText("count = " + totalPoint());
    }

    /**
     * 현재 보드에서 이동 가능한지 여부를 알려줌
     * @return 보드가 이동가능한지 여부
     */
    public boolean movable() {
        if (numOfBlanks() > 0) return true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3 && get(i, j) == get(i, j + 1))
                    return true;
                if (i < 3 && get(i, j) == get(i + 1, j))
                    return true;
            }
        }
        return false;
    }

    /**
     * 보드에서 i, j 위치의 값 읽어오기
     * @param i row index (0~3)
     * @param j column index (0~3)
     * @return value of puzzle_board[i][j]
     */
    public int get(int i, int j) {
        return puzzle_board[i][j].getValue();
    }

    /**
     * 블록을 (합치는 과정 없이) 모두 왼쪽으로 붙인다.
     */
    public void shiftLeft() {
        // TODO 2.1
    }

    /**
     * 블록을 왼쪽으로 움직인다.
     * 같은 값의 블록이 연속으로 나오는 경우에는 둘을 합친다.
     * 단, 한번의 이동에서 합치는 연산은 각 블록당 한번만 수행한다.
     * shiftLeft() 를 활용하면 쉽게 작성할 수 있다.
     */
    public void moveLeft() {
        // TODO 2.2
    }

    /**
     * 블록의 좌우를 뒤집는다.
     */
    public void reverse() {
        for (int i = 0; i < 4; i++) {
            int[] values = new int[4];
            // TODO 2.3
        }
    }

    /**
     * 퍼즐 보드를 행렬로 보았을 때, 행과 열을 뒤바꾼 전치 행렬을 취한다.
     * for all i, j in 0...3, puzzle_board[i][j] <- puzzle_board[j][i]
     */
    public void transpose() {
        int[][] matrix = new int[4][4];
        // TODO 2.4
    }

    /**
     * 블록을 오른쪽으로 움직인다. 같은 값의 블록이 있을 경우에는 둘을 합친다.
     * 직접 구현하지 않고 transpose(), reverse(), moveLeft() 등을 (필요에 따라) 조합해서 구현한다.
     */
    public void moveRight() {
        // TODO 2.5.1
    }

    /**
     * 블록을 위로 움직인다. 같은 값의 블록이 있을 경우에는 둘을 합친다.
     * 직접 구현하지 않고 transpose(), reverse(), moveLeft() 등을 (필요에 따라) 조합해서 구현한다.
     */
    public void moveUp() {
        // TODO 2.5.2
    }

    /**
     * 블록을 아래로 움직인다. 같은 값의 블록이 있을 경우에는 둘을 합친다.
     * 직접 구현하지 않고 transpose(), reverse(), moveLeft() 등을 (필요에 따라) 조합해서 구현한다.
     */
    public void moveDown() {
        // TODO 2.5.3
    }

    /**
     * 퍼즐 보드에서 빈 블록이 몇개인지 알려준다.
     * @return 빈 블록의 수
     */
    public int numOfBlanks() {
        int num_of_blanks = 0;
        // TODO 2.6
        return num_of_blanks;
    }

    /**
     * 퍼즐 보드에서 최소값을 리턴한다.
     * @return 퍼즐 보드의 블록 중 최소값
     */
    public int minNumber() {
        int min = 0;
        // TODO 2.7.1
        return min;
    }

    /**
     * 퍼즐 보드에서 최대값을 리턴한다.
     * @return 퍼즐 보드의 블록 중 최대값
     */
    public int maxNumber() {
        int max = 0;
        // TODO 2.7.2
        return max;
    }

    /**
     * 퍼즐 보드에 빈 공간 하나에 2 또는 4를 채운다.
     * 80%의 확률로 2를 채우고, 20% 확률로 4를 채우되,
     * 만약 현재 블록 중 4를 넘는 값이 없다면 2만 채울 수 있다.
     * (2~4 만 있는 경우에는 2만 채울 수 있으며, 8 이상의 값이 있을 때만 위 확률을 적용)
     */
    public void randomFill() {
        int twoOrFour = 2;
        int min = minNumber();
        // TODO 2.8.1
        // fill below false to proper condition
        if (false) {
            twoOrFour = 4;
        }

        int num_of_blanks = numOfBlanks();

        if (maxNumber() == 2048) {
            JOptionPane.showMessageDialog(null, "you win!");
        } else if (min != 0 && num_of_blanks == 0) {
            JOptionPane.showMessageDialog(null,
                    "game over! : " + totalPoint());
        } else {
            // TODO 2.8.2
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    // TODO 2.8.2
                }
            }
        }
    }

    /**
     * 퍼즐 보드의 모든 블록의 총합을 리턴한다.
     * @return 퍼즐 보드 블록의 합계
     */
    public int totalPoint() {
        int p = 0;
        // TODO 2.9
        return p;
    }

    /**
     * changed 퍼즐보드의 내용을 저장해둔 backup 과 현재 퍼즐보드를 비교한다.
     * @param backup 퍼즐 보드의 내용을 정수로 저장해둔 2차원 배열
     * @return 퍼즐 보드의 현재 값이 backup 과 달라졌는지 여부
     */
    public boolean changed(int[][] backup) {
        boolean result = false;
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                if (puzzle_board[i][j].getValue() != backup[i][j])
                    return true;
            }
        }
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // 더이상 움직일 수 없는 경우 게임 종료
        if (!movable()) {
            JOptionPane.showMessageDialog(null,
                    "game over! : " + totalPoint());
        }

        // 퍼즐 보드의 이동 시도 전 내용을 저장
        int[][] backup = new int[4][4];
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                backup[i][j] = puzzle_board[i][j].getValue();
            }
        }
        // 입력받은 버튼의 종류에 따라 행동
        switch (e.getActionCommand()) {
            case "<":
                moveLeft();
                if (changed(backup)) {
                    randomFill();
                    score.setText("count = " + totalPoint());
                } else {
                    System.out.println("not changed");
                }
                break;
            case ">":
                moveRight();
                if (changed(backup)) {
                    randomFill();
                    score.setText("count = " + totalPoint());
                } else {
                    System.out.println("not changed");
                }
                break;
            case "^":
                moveUp();
                if (changed(backup)) {
                    randomFill();
                    score.setText("count = " + totalPoint());
                } else {
                    System.out.println("not changed");
                }
                break;
            case "v":
                moveDown();
                if (changed(backup)) {
                    randomFill();
                    score.setText("count = " + totalPoint());
                } else {
                    System.out.println("not changed");
                }
                break;
            default:
                break;
        }
    }
}
