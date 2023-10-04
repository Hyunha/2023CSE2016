import java.text.DecimalFormat;

public class TempConverter {
    public static void main(String[] args) {
        String input = "1302.2";
        double c = Double.parseDouble(input);
        double f = (9.0 / 5.0) * c + 32;

        DecimalFormat formatter = new DecimalFormat("0.00");
        System.out.println("섭씨 " + c + "도 = 화씨 " + formatter.format(f) + "도");
    }
}
