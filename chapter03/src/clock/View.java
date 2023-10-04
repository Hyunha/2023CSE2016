package clock;

import javax.swing.*;
import java.time.LocalTime;

public class View {

    public void show(LocalTime now) {
        System.out.println(now);
    }

    public void showSwing(LocalTime now) {
        JOptionPane.showMessageDialog(null, now);
    }
}
