package counter2;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        CounterFrame view = new CounterFrame(model);
    }
}
