package database;

public class Database {
    private Record[] base;
    private int NOT_FOUND = -1;

    /** Constructor - Database 초기화
     * @param initial_size 데이터베이스 규모 */
    public Database(int initial_size) {
        if (initial_size > 0)
            base = new Record[initial_size];
        else
            base = new Record[1];
    }

    /** findLocation - 데이터베이스에서 키가 k인 레코드의 인덱스 검색
     * @param k 검색할 레코드의 키
     * @return 찾으면 해당 레코드의 인덱스, 찾지 못하면 NOT_FOUND */
    private int findLocation(Key k) {
        for (int i = 0; i < base.length; i++)
            if (base[i] != null && base[i].getKey().equals(k))
                return i;
        return NOT_FOUND;
    }

    /** findEmpty 데이터베이스에서 빈 자리 검색
     * @return 찾으면 빈 자리 인덱스, 찾지 못하면 NOT_FOUND */
    private int findEmpty() {
        for (int i = 0; i < base.length; i++)
            if (base[i] == null)
                return i;
        return NOT_FOUND;
    }

    /** find 키가 k인 레코드를 데이터베이스에서 검색
     * @param k 검색할 레코드의 키
     * @return 찾으면 해당 레코드 주소, 찾지 못하면 null */
    public Record find(Key k) {
        int index = findLocation(k);
        if (index == NOT_FOUND)
            return null;
        else
            return base[index];
    }

    /** delete 키가 k인 레코드를 삭제
     * @param k 삭제할 레코드의 키
     * @return 성공적으로 삭제되면 true, 키가 k인 레코드가 없으면 false */
    public boolean delete(Key k) {
        int index = findLocation(k);
        if (index == NOT_FOUND)
            return false;
        else {
            base[index] = null;
            return true;
        }
    }

    /** insert 레코드 r을 데이터베이스에 추가
     * @param r 데이터베이스에 추가할 레코드 r
     * @return 성공적으로 추가되면 true, 추가에 실패하면 false */
    public boolean insert(Record r) {
        if (findLocation(r.getKey()) != NOT_FOUND)
            return false;
        int index = findEmpty();
        if (index != NOT_FOUND) // found an empty slot
            base[index] = r;
        else { // database is full and gets more space
            Record[] temp = new Record[base.length * 2];
            for (int i = 0; i < base.length; i++)
                temp[i] = base[i];
            temp[base.length] = r;
            base = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Database db = new Database(4);

        BankAccount a1 = new BankAccount(50000, new IntegerKey(55));
        Key k = new StringKey("열려라");
        BankAccount a2 = new BankAccount(10000, k);
        boolean transaction1 = db.insert(a1);
        boolean transaction2 = db.insert(a2);

        Record p = db.find(k);
        BankAccount q = (BankAccount)p;
        System.out.println(q.getBalance());

        k = q.getKey();
        if (k instanceof IntegerKey) {
            System.out.println(((IntegerKey)k).getInt());
        } else if (k instanceof StringKey) {
            System.out.println(((StringKey) k).getString());
        } else {
            System.out.println("모르는 Key 출현 오류");
        }
    }
}
