package temp;

public class Controller {
    public void control(Model m, View v) {
        double c = v.getTemperature();
        v.showTemperature(c, m.ctof(c));
    }
}
