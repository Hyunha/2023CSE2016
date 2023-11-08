package database;

public class IntegerKey implements Key {
    private int k;

    public IntegerKey(int i) {
        k = i;
    }

    /** equals 인수로 제공된 키와 자신이 같은지 비교
     * @param m 비교 대상 키
     * @return 같으면 true, 다르면 false */
    public boolean equals(Key m) {
        return k == ((IntegerKey)m).getInt();
    }

    public int getInt() {
        return k;
    }
}
