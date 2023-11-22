package puzzle;

import java.awt.*;
import javax.swing.*;

public class PuzzleFrame extends JFrame {
	
	private SlidePuzzleBoard board;
	private PuzzleButton[][] button_board;
	
	public PuzzleFrame(SlidePuzzleBoard b) {
		board = b;
		button_board = new PuzzleButton[4][4];
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,4));
		for (int row = 0; row < button_board.length; row++)
			for (int col = 0; col < button_board.length; col++) {
				button_board[row][col] = new PuzzleButton(board,this);
				cp.add(button_board[row][col]);
			}
		update();
		setTitle("Slide Puzzle");
		setSize(250,250);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void update() {
		PuzzlePiece pp;
		for (int row = 0; row < button_board.length; row++)
			for (int col = 0; col < button_board.length; col++) {
				pp = board.getPuzzlePiece(row, col);
				if (pp != null)
					button_board[row][col].setText(Integer.toString(pp.faceValue()));
				else
					button_board[row][col].setText("");
			}
	}

}