public class Dangling {
    public static void main(String[] args) {
        if (true) {
            if (false) {
                System.out.println("Foo!");
                System.out.println("Zoo!");
            } else {
                System.out.println("Bar!");
            }
        }
    }
}
