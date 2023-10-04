package clock;

public class Clock {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller();
        c.control(m, v);
    }
}
