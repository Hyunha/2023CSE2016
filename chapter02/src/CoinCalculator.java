public class CoinCalculator {

    public static void main(String[] args) {
        int quarters = 9;
        int dimes = 2;
        int nickels = 0;
        int pennies = 6;

        int sum = quarters * 25 + dimes * 10 + nickels * 5 + pennies * 1;
        System.out.println(sum);
    }
}