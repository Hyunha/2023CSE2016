package bank;

import javax.swing.*;

public class BankReader {

    private String input_line;

    /* BankReader - 입력기 초기화 */
    public BankReader() {
        input_line = "";
    }

    /* readCommand - 요청 서비스 파악
     * @param message - 안내 메시지
     * @return 요청 문자열의 첫 문자 */
    public char readCommand(String message) {
        input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
        return input_line.charAt(0);
    }

    /* readAmount - 요청 액수 파악
     * @return 금액, 문제가 발생하면 알리고 0을 리턴 */
    public int readAmount() {
        int amount = 0;
        String s = input_line.substring(1, input_line.length());
        s = s.trim();
        if (s.length() > 0)
            amount = Integer.parseInt(s);
        else
            JOptionPane.showMessageDialog(null, "금액 입력 오류");
        return amount;
    }
}
