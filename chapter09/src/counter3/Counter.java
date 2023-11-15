package counter3;

public class Counter {
    private int count;

    /**
     * Counter 카운터 초기 설정
     * @param start 카운터의 초기값
     */
    public Counter(int start) {
        count = start;
    }

    /**
     * increment 카운터 값 증가
     */
    public void increment() {
        count += 1;
    }

    /**
     * countOf 카운터 값 리턴
     * @return 카운터 현재 값
     */
    public int countOf() {
        return count;
    }
}
