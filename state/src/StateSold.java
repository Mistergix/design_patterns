public class StateSold implements State {
    private CandyMachine candyMachine;

    StateSold(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void removeCoin() {
        System.out.println("already consumed");
    }

    @Override
    public void insertCoin() {
        System.out.println("can't insert more");
    }

    @Override
    public void rotateHandle() {
        System.out.println("no need to rotate the handle twice");
    }

    @Override
    public void deliver() {
        candyMachine.free();
        if (!candyMachine.isEmpty()) {
            candyMachine.setState(candyMachine.getNoCoin());
        } else {
            candyMachine.setState(candyMachine.getEmpty());
        }
    }
}
