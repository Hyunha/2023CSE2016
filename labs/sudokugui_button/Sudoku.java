package sudokugui;

import java.util.*;

public class Sudoku {
	
	private int[][] solution = new int[9][9];
	private int hole_count;
	private int[][] puzzle_board = new int[9][9];
	private int row_selected = -1;
	private int col_selected = -1;
	
	/** 객체 초기화 메소드 
	 * 
	 * @param count - 빈칸의 개수 
	 */
	public Sudoku(int count) {
		createSolutionBoard();
		hole_count = count;
		createPuzzleBoard(count);
	}
	
	/** 퍼즐 보드에서 주어진 가로줄, 세로줄 인덱스에 위치한 숫자를 리턴 한다. 
	 * @param row - 가로줄 인덱스 
	 * @param col - 새로줄 인덱스 
	 * @return 숫자 
	 */
	public int findDigitInPuzzleBoard(int row, int col) {
		return puzzle_board[row][col];
	}

	/** 정답 보드에서 주어진 가로줄, 세로줄 인덱스에 위치한 숫자를 리턴 한다. 
	 * @param row - 가로줄 인덱스 
	 * @param col - 새로줄 인덱스 
	 * @return 숫자 
	 */
	public int findSolution(int row, int col) {
		return solution[row][col];
	}
	
	/** 빈칸의 개수를 리턴 한다.
	 * 
	 * @return 빈칸의 개수
	 */
	public int countHoles() {
		return hole_count;
	}
	
	/** 해답 보드를 만든다. */
	private void createSolutionBoard() {
		int[] random_sequence = generateRandomPermutation(9);
		for (int i = 0; i < 9; i++)
			random_sequence[i] += 1;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 9; j++)
				solution[i][j] = random_sequence[(j+3*i+i/3)%9];
		for (int k = 0; k < 2; k++) 
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 9; j++)
					if (j % 3 != 2)
						solution[i+3*(k+1)][j] = solution[i+3*k][j+1];
					else
						solution[i+3*(k+1)][j] = solution[i+3*k][j-2];
		shuffleRibbons();
		transpose();
		shuffleRibbons();
		transpose();
		// showBoard(solution);
	}
	
	/** 0~n-1 범위의 정수 수열을 무작위로 섞은 배열을 리턴 한다.
	 * 
	 * @param n - 수열의 길이 
	 * @return 0~n-1 범위의 정수를 무작위로 섞어 만든 배열 
	 */
	private int[] generateRandomPermutation(int n) {
		Random random = new Random();
	    int[] permutation = new int[n];
	    for (int i = 0; i < n; i++) {
	        int d = random.nextInt(i+1);
	        permutation[i] = permutation[d];
	        permutation[d] = i;
	    }
	    return permutation;
	}
	
	/** 스도쿠 퍼즐 보드를 망가트리지 않는 한도 내에서 solution 배열의 가로줄을 무작위로 섞는다. */
	private void shuffleRibbons() {
		int[][] shuffled = new int[9][9];
		int[] random_index; 
		for (int i = 0; i < 3; i++) {
			random_index = generateRandomPermutation(3);
			for (int j = 0; j < 3; j++)
				shuffled[i*3+random_index[j]] = solution[i*3+j]; 
		}
		solution = shuffled;
	}
	
	/** solution 배열의 행과 열을 바꾼다. */
	private void transpose() {
		int[][] transposed = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				transposed[i][j] = solution[j][i];
		solution = transposed; 
	}
	
	/** 2차원 배열 b를 콘솔 윈도우에 보여준다.
	 * 
	 * @param b - 2차원 배열 
	 */
	private void showBoard(int[][] b) {
		System.out.println("스도쿠 보드");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.print(b[i][j] + " ");
			System.out.println();
		}
	}
	
	/** solution 배열을 puzzle_board 배열에 카피한 뒤, count 개수만큼 무작위로 빈칸(0)으로 만든다.
	 * 
	 * @param count - 비울 빈칸의 개수 
	 */
	private void createPuzzleBoard(int count) {
		// copy solution board to puzzle board
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				puzzle_board[i][j] = solution[i][j];
		// make holes randomly
		Random random = new Random();
		int count_down = count;
		while (count_down > 0) {
			int i = random.nextInt(9);
			int j = random.nextInt(9);
			if (puzzle_board[i][j] != 0) {
				puzzle_board[i][j] = 0;
				count_down -= 1;
			}
		}
	}
	
	/** row_selected번 가로줄, col_selected번 세로줄에 digit을 채울 수 있는지 검사하여, 
	 *  가능하면 채우고 true를 리턴하고, 불가능하면 false를 리턴 한다.
	 * 
	 * @param digit - 빈칸에 채울 수 (1~9 중 하나) 
	 * @return 퍼즐 보드 조건에 만족하여 빈칸을 채웠으면 true, 만족하지 않으면 false 
	 */
	public boolean check(int digit) {
		if (puzzle_board[row_selected][col_selected] == 0 && 
				solution[row_selected][col_selected] == digit) {
			puzzle_board[row_selected][col_selected] = digit;
			hole_count -= 1;
			return true;
		}
		else
			return false;
	}
	
	/** 선택된 row번 가로줄, c번 세로줄 인덱스를 필드 변수에 기록  
	 * 
	 * @param row - 가로줄 인덱스  
	 * @param col - 세로줄 인덱스
	 */
	public void selected(int row, int col) {
		row_selected = row;
		col_selected = col;
	}
}
