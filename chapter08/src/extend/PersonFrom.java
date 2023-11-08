package extend;

public class PersonFrom extends Person {

    private String city;

    public PersonFrom(String n, String c) {
        super(n);
        city = c;
    }

    public String getCity() {
        return city;
    }

    public boolean same(PersonFrom other) {
        return sameName(other) &&
                city.equals(other.getCity());
    }

    public static void main(String[] args) {
        Person p = new Person("마음");
        PersonFrom q = new PersonFrom("소리", "서울");
//        System.out.println(p.getCity());
//        System.out.println(q.getName());
//        System.out.println(p.sameName(p));
//        System.out.println(q.sameName(p));
//        System.out.println(q.same(p));
    }
}
