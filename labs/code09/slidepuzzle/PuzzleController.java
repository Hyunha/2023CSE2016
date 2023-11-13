import javax.swing.*;

/** PuzzleController 슬라이드 퍼즐 조각의 움직임을 제어  */
public class PuzzleController {
	private SlidePuzzleBoard board;
	private PuzzleWriter writer;
	
	/** Constructor - PuzzleController 초기화 메소드 
	 * @param b - 퍼즐 보드 
	 * @param w - 출력 뷰  */
	public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
		board = b;
		writer = w;
	}
	
	/** play 퍼즐 시작  */
	public void play() {
		while (true) {
			writer.displayPuzzle(); // 
			String input = JOptionPane.showInputDialog("움직일 퍼즐 조각 번호를 선택하세요.");
			int n = Integer.parseInt(input);
			if (! board.move(n))
				writer.printError("움직일 수 없습니다.");
		}
	}

}
