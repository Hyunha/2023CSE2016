
public class SudokuController {
	
	private Sudoku sudoku;
	private PlayerInput reader;
	private SudokuWriter writer;
	
	/** Sudoku, PlayerInput, SudokuWriter 객체를 생성하여 필드 변수에 지정한다. */
	public SudokuController() {
		reader = new PlayerInput();
		int hole_count = reader.selectLevel();
		sudoku = new Sudoku(hole_count);
		writer = new SudokuWriter(sudoku);
	}
	
	/** 스도쿠 퍼즐 게임을 진행한다. */
	public void playSudokuPuzzle() {
		int i, j, d;
		while (sudoku.countHoles() > 0) {
			i = reader.selectNumber("가로줄 번호를 넣어주세요.") - 1;
			j = reader.selectNumber("세로줄 번호를 넣어주세요.") - 1;
			d = reader.selectNumber("숫자를 넣어주세요.");
			if (sudoku.check(d,i,j))
				writer.repaint();
		}
	}
}
