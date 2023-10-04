public class ErrorDemo {
    public static void main(String[] args) {
        // [compile-time errors]
        ////////////////////////
        // parsing errors
//        System.out.println((1 + 2( * 3);
//        // type errors
//        System.out.println(3 + true);
//        int i = true;
//        System.out.println(I * 2);
//        // declaration errors
//        int n = 3;
//        double n = 3.14;
//        System.out.println(n);

        // [run-time errors]
        ////////////////////////
        // exception errors
        int d = Integer.parseInt(args[0]);
        System.out.println(1 / d);
        // logic errors
        int x = 3;
        int y = 7;
        System.out.println(x = y);
    }
}
