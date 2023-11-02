package test;

import java.text.Format;
import java.util.Formatter;
import java.util.Random;

public class RandomVsMath {

    static long front;
    static long back;

    public static void usingRandomClass_reuse(long test_size) {
        Random random = new Random();
        for (long i = 0; i < test_size; i++) {
            if(random.nextInt(256) >= 128) {
                back++;
            } else {
                front++;
            }
        }
    }

    public static void usingRandomClass_renew(long test_size) {
        for (long i = 0; i < test_size; i++) {
            Random random = new Random();
            if(random.nextInt(256) >= 128) {
                back++;
            } else {
                front++;
            }
        }
    }

    public static void usingMathsRandom(long test_size) {
        for (long i = 0; i < test_size; i++) {
            if ((int)(Math.random()*256) >= 128) {
                back++;
            } else {
                front++;
            }
        }
    }

    public static void main(String[] args) {
        int test_size = 1_0000_0000;
        long start, end, count;
        // test for RandomClass
        front = 0; back = 0;
        boolean reuse_random = true;
        start = System.currentTimeMillis();
        if (reuse_random)
            usingRandomClass_reuse(test_size);
        else
            usingRandomClass_renew(test_size);
        end = System.currentTimeMillis();
        long time_for_random_class = end - start;
        long delta_of_random_class = Math.abs(front - back) / 2;
        System.out.println("usingRandomClass (" + (reuse_random?"reuse":"renew") + ")");
        System.out.println(" time  : " + time_for_random_class);
        System.out.println(" front : " + front + ", back : " + back);
        System.out.println(" delta : " + delta_of_random_class);
        // test for MathRandom
        front = 0; back = 0;
        start = System.currentTimeMillis();
        usingMathsRandom(test_size);
        end = System.currentTimeMillis();
        long time_for_math_random = end - start;
        long delta_of_math_random = Math.abs(front - back) / 2;
        System.out.println("usingMathsRandom");
        System.out.println(" time  : " + time_for_math_random +
                " (" + ((int)(time_for_math_random * 10000. / time_for_random_class) / 100.) + "%)");
        System.out.println(" front : " + front + ", back : " + back);
        System.out.println(" delta : " + delta_of_math_random +
                " (" +
                (delta_of_math_random > delta_of_random_class ? "+":"-") +
                Math.abs(delta_of_math_random - delta_of_random_class) + ")");
    }
}
