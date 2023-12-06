package problem2;

import javax.swing.*;

public class Piece extends JButton {
    private int v;
    public Piece(String m) {
        super();
        setText(m);
    }

    /**
     * 텍스트에 문자열을 지정하고, 정수로 해석해서 v 에 저장한다.
     * 만약 입력받은 문자열을 정수로 변환할 수 없는 경우, v 에 -1 을 저장한다.
     * @param s the string used to set the text
     */
    public void setText(String s) {
        super.setText(s);
        try {
            v = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            v = -1;
        }
    }

    /**
     * 블록 조각에 정수 값을 지정한다.
     * 해당 정수 값을 v 에 저장함과 동시에
     * 문자열로 변환한 값으로 setText() 메소드도 같이 호출한다.
     * @param i 블록 조각에 저장할 정수 값
     */
    public void setValue(int i) {
        v = i;
        if (i > 0) {
            setText("" + i);
        } else {
            setText("");
        }
    }
    public int getValue() {
        return v;
    }
}
