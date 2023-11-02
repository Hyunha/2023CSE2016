package marblegame;

public class MarbleGame {
    public static void main(String[] args) {
        Player p = new Player();
        Computer c = new Computer(); Registrar r = new Registrar();
        new GameController(p, c, r).play();
    }
}
