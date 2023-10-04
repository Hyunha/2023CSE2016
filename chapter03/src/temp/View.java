package temp;

import javax.swing.*;

public class View {
    public double getTemperature() {
        String inp = JOptionPane.showInputDialog(
                null,
                "섭씨 온도를 정수로 입력하세요.");
        int c = Integer.parseInt(inp);
        return (double) c;
    }

    public void showTemperature(double c, double f) {
        JOptionPane.showMessageDialog(null,
                "썹씨 " + c + "도는 " +
                        "화씨 " + f + "도입니다."
                );
    }
}
