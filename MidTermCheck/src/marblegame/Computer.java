package marblegame;

import java.util.Random;

public class Computer {

    private int beads = 10;

    public void addBeads(int n) {
        beads += n;
    }

    public void removeBeads(int n) {
        beads -= n;
    }

    public int getBeads() {
        return beads;
    }

    public boolean lose() {
        return beads <= 0;
    }

    public int pickForAttack() {
        int n = 5;
        if (beads < 5)
            n = beads;
        return (int)(Math.random() * n) + 1; // 1~n
    }

    public int pickForGuard() {
        int n = 5;
        if (beads < 5)
            n = beads;
        return (int)(Math.random() * (n + 1)) ; // 0~n
    }

    public boolean pickEven() {
        return (int)(Math.random() * 2) == 1;
    }
}
