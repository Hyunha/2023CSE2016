package marblegame;

public class Player {
    private int beads = 10;

    public void addBeads(int n) {
//        beads = beads + n;
        beads += n;
    }

    public void removeBeads(int n) {
        beads -= n;
    }

    public int getBeads() {
        return beads;
    }

    public boolean lose() {
//        if (beads <= 0)
//            return true;
//        else
//            return false;
        return beads <= 0;
    }
}
