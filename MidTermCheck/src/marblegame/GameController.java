package marblegame;

public class GameController {
    private Player player;
    private Computer computer;

    private Registrar registrar;

    public GameController(Player p, Computer c, Registrar r) {
        player = p;
        computer = c;
        registrar = r;
    }

    public void playerTurn() {
        System.out.println("* 당신의 공격!");
        int max = Math.min(player.getBeads(), computer.getBeads());
        int n_of_player = registrar.chooseForAttack(max);
        System.out.println("당신은 " + n_of_player + "개의 구슬을 집었습니다.");
        boolean player_is_even = registrar.chooseEven();
        if (player_is_even)
            System.out.println("당신은 짝을 선택했습니다.");
        else
            System.out.println("당신은 홀을 선택했습니다.");
        int n_of_computer = computer.pickForGuard();
//        while (player.getBeads() < n_of_computer) {
//            n_of_computer = computer.pickForGuard();
//        }
        System.out.println("컴퓨터가 손을 폅니다...");
        System.out.println(n_of_computer + "개의 구슬입니다!");
        boolean computer_is_even = (n_of_computer % 2 == 0);
        if (player_is_even == computer_is_even) {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + n_of_player);
            player.addBeads(n_of_player);
            computer.removeBeads(n_of_player);
        } else {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + n_of_player);
            player.removeBeads(n_of_player);
            computer.addBeads(n_of_player);
        }
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }
    public void computerTurn() {
        System.out.println("* 컴퓨터의 공격!");
        int max = Math.min(player.getBeads(), computer.getBeads());
        int n_of_player = registrar.chooseForGuard(max);
        boolean player_is_even = isEven(n_of_player);
        System.out.println("당신은 " + n_of_player + "개의 구슬을 집었습니다.");
        int n_of_computer = computer.pickForAttack();
        while (player.getBeads() < n_of_computer) {
            n_of_computer = computer.pickForAttack();
        }
        System.out.println("컴퓨터가 " + n_of_computer + "개의 구슬을 집어듭니다...");
        boolean computer_is_even = isEven(n_of_computer);
        if (computer_is_even)
            System.out.println("컴퓨터가 짝을 선택합니다...");
        else
            System.out.println("컴퓨터가 홀을 선택합니다...");
        if (player_is_even == computer_is_even) {
            System.out.println("당신이 졌습니다. 구슬 제출! : " + n_of_computer);
            player.removeBeads(n_of_computer);
            computer.addBeads(n_of_computer);
        } else {
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + n_of_computer);
            player.addBeads(n_of_computer);
            computer.removeBeads(n_of_computer);
        }
    }

    public void printStatus() {
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }
    public void play() {
        System.out.println("* 게임을 시작합니다...");
        printStatus();
        while (!(player.lose() || computer.lose())) {
            playerTurn();
            printStatus();
            if (player.lose() || computer.lose())
                break;
            computerTurn();
            printStatus();
        }
        if (computer.lose()) {
            System.out.println("축하합니다! 당신의 승리입니다!");
        } else {
            System.out.println("아쉽지만 당신의 패배입니다...");
        }
    }
}
