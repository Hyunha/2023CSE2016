package slidepuzzleplus;

/** PuzzlePiece - 슬라이드 게임 퍼즐 조각  */
public class PuzzlePiece { 
	private int face_value;
	
	public PuzzlePiece(int value) { 
		face_value = value; 
	}
	
	/** faceValue - 퍼즐 조각에 표시되어 있는 수를 리턴   
	 * @return 퍼즐 조각에 표시되어 있는 수  */ 
	public int faceValue() { 
		return face_value; 
	}
}
