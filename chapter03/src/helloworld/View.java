package helloworld;

import javax.swing.*;

public class View {
    public void show(String message) {
        System.out.println(message);
    }

    public void showSwing(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
