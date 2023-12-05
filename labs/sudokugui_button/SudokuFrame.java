package sudokugui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SudokuFrame extends JFrame {
	
	private Sudoku board;
	private SudokuButton[][] button_board;
	private DigitButton[] digit_buttons;
	
	public SudokuFrame(Sudoku b) {
		board = b;
		button_board = new SudokuButton[9][9];
		digit_buttons = new DigitButton[9];
		
		Container cp = getContentPane(); 
		cp.setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new GridLayout(9,9));
		String digit;
		for (int row = 0; row < 9; row++)
			for (int col = 0; col < 9; col++) {
				button_board[row][col] = new SudokuButton(board, row, col);
				digit = Integer.toString(board.findDigitInPuzzleBoard(row,col));
				button_board[row][col].setText(digit);
				p1.add(button_board[row][col]);
			}
		JPanel p2 = new JPanel(new GridLayout(1,9));
		for (int i = 1; i <= 9; i++) {
			digit_buttons[i-1] = new DigitButton(board, this);
			digit = Integer.toString(i);
			digit_buttons[i-1].setText(digit);
			p2.add(digit_buttons[i-1]);
		}
		cp.add(p1, BorderLayout.NORTH);
		cp.add(p2, BorderLayout.SOUTH);
		update();
		setTitle("Sudoku");
		setSize(300,350);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void update() {
		for (int row = 0; row < 9; row++)
			for (int col = 0; col < 9; col++) {
				int d = board.findDigitInPuzzleBoard(row,col);
				if (d == 0)
					button_board[row][col].setText("");
				else
					button_board[row][col].setText(Integer.toString(d));
			}
	}

}
