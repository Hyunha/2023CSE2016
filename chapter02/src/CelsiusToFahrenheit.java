import javax.swing.*;
import java.text.DecimalFormat;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        String message = "섭씨 온도를 정수로 입력해주세요.";
        String input = JOptionPane.showInputDialog(message);
        int c = Integer.parseInt(input);
        double f = (9.0 / 5.0) * c + 32;

        DecimalFormat formatter = new DecimalFormat("0.0");
        System.out.print("섭씨 " + c + "도는 ");
        System.out.println("화씨로 " + formatter.format(f) + "도 입니다.");
    }
}
