package database;

public interface Record {
    /**
     * getKey 레코드를 유일하게 식별하는 키를 리턴
     * @return 키
     */
    public Key getKey();
}
