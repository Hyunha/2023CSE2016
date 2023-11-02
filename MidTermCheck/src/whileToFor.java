import javax.swing.*;
public class whileToFor {
    /** computeAverage 제출한 시험 점수 평균 계산 (while loop 사용)
     *  @param how_many 시험 점수의 개수 (양수)
     *  @return 평균 점수 */
    public double computerAverageWhile(int how_many) {
        double total_points = 0.0;
        int count = 0;
        while (count < how_many) {
            // loop invariant : total_points == 지금까지 합산한 점수의 합
            String input = JOptionPane.showInputDialog("다음 시험 점수?");
            int score = Integer.parseInt(input);
            total_points = total_points + score;
            count = count + 1;
            System.out.println("개수 = " + count + ", 누적 점수 = " + total_points);
        }
        return total_points / how_many;
    }

    /** computeAverage 제출한 시험 점수 평균 계산 (for loop 사용)
     *  @param how_many 시험 점수의 개수 (양수)
     *  @return 평균 점수 */
    public double computerAverageFor(int how_many) {
        double total_points = 0.0;
        for(int count = 0; count < how_many; count++) {
            // loop invariant : total_points == 지금까지 합산한 점수의 합
            String input = JOptionPane.showInputDialog("다음 시험 점수?");
            int score = Integer.parseInt(input);
            total_points = total_points + score;
            System.out.println("개수 = " + count + ", 누적 점수 = " + total_points);
        }
        return total_points / how_many;
    }
    public static void main(String[] args) {
        whileToFor loop = new whileToFor();
        System.out.println("평균 점수 = " + loop.computerAverageWhile(5));
//        System.out.println("평균 점수 = " + loop.computerAverageFor(5));
    }
}
