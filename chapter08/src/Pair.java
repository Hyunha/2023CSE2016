public class Pair {
    Object[] r = new Object[2];

    public Pair(Object obj1, Object obj2) {
        r[0] = obj1;
        r[1] = obj2;
    }

    public Object get1st() {
        return r[0];
    }

    public Object get2nd() {
        return r[1];
    }

    public static void main(String[] args) {
        Pair p = new Pair("abc", 7);
        Object item1 = p.get1st();
        System.out.println((String)item1 + (String)item1);
        Object item2 = p.get2nd();
        System.out.println((int)item2 + 2);
    }
}
