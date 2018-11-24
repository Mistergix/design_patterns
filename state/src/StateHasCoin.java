import java.util.Random;

public class StateHasCoin implements State {
    private CandyMachine candyMachine;
    private Random random = new Random(System.currentTimeMillis());

    StateHasCoin(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert more");
    }

    @Override
    public void removeCoin() {
        System.out.println("Coin returned");
        candyMachine.setState(candyMachine.getNoCoin());
    }

    @Override
    public void rotateHandle() {
        System.out.println("you turned the handle");
        int winner = random.nextInt(3);
        if (winner == 0 && candyMachine.getNumber() >= 2) {
            candyMachine.setState(candyMachine.getWinner());
        } else {
            candyMachine.setState(candyMachine.getSold());
        }
    }

    @Override
    public void deliver() {
        System.out.println("No candy delivered");
    }
}
