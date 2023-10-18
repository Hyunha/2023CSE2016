import javax.swing.*;

/** VoteCount 투표 애플리케이션 */
public class VoteCount {
    public static void main(String[] args) {
        int num_candidates = 4;
        int[] votes = new int[num_candidates]; // 0으로 자동 초기화

        boolean processing = true;
        while (processing) {
            /* loop invariant: 투표는 해당 배열에 누적되었음 */
            String input = JOptionPane.showInputDialog("원하는 후보에 투표하세요: 0, 1, 2, 3");
            int v = Integer.parseInt(input);
            if (v >= 0 && v < votes.length)
                votes[v] = votes[v] + 1;
            else
                processing = false;
        }
        for (int i = 0; i != votes.length; i = i + 1)
            System.out.println("후보 " + i + "번이 " + votes[i] + "표를 득표하였습니다.");
    }
}