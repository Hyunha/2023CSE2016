public class ArrayTest {

    public static void main(String[] args) {
        int[] r = {1,2,3,4,5,6};
        for(int i = 0; i < 6; i++) {
            System.out.println(r[i]);
        }

        double[][] ragged = new double[4][];
        ragged[0] = new double[2];
        ragged[1] = new double[1];
        ragged[2] = new double[0];
    }
}
