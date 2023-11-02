package marblegame;

import javax.swing.*;

public class Registrar {

    public boolean chooseEven() {
        String input = JOptionPane.showInputDialog("홀/짝?").trim();
        while (true) {
            if ("홀".equals(input) || "짝".equals(input)) {
                return "짝".equals(input);
            } else {
                input = JOptionPane.showInputDialog("홀/짝?").trim();
            }
        }
    }

    public int chooseForAttack(int max) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("공격! 몇개를 선택할래요?"));
        while (true) {
            if (1 <= n && n <= 5 && n <= max) {
                return n;
            } else {
                n = Integer.parseInt(JOptionPane.showInputDialog("공격! 몇개를 선택할래요?"));
            }
        }
    }

    public int chooseForGuard(int max) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("방어! 몇개를 선택할래요?"));
        while (true) {
            if (0 <= n && n <= 5 && n <= max) {
                return n;
            } else {
                n = Integer.parseInt(JOptionPane.showInputDialog("방어! 몇개를 선택할래요?"));
            }
        }
    }
}
