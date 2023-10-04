import javax.swing.*;

public class ChangeGUI {
    public static void main(String[] args) {
        int dollars = Integer.parseInt(JOptionPane.showInputDialog("몇 달러 인가요?"));
        int cents = Integer.parseInt(JOptionPane.showInputDialog("몇 센트 인가요?"));
        int money = dollars * 100 + cents;
        System.out.println("quarters = " + (money / 25));
        money = money % 25;
        System.out.println("dimes = " + (money / 10));
        money = money % 10;
        System.out.println("nickels = " + (money / 5));
        money = money % 5;
        System.out.println("pennies = " + money);

        String a = "aaa";
        String b = "aaa";
        System.out.println(a == b);
    }
}
