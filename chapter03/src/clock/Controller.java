package clock;

public class Controller {
    public void control(Model m, View v) {
        v.showSwing(m.whatTimeIsIt());
    }
}
