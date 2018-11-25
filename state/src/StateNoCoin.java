public class StateNoCoin implements State {
    private CandyMachine candyMachine;

    StateNoCoin(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void removeCoin() {
        System.out.println("You didn't insert one");
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        candyMachine.setState(candyMachine.getHasCoin());
    }

    @Override
    public void rotateHandle() {
        System.out.println("No coin inserted");
    }

    @Override
    public void deliver() {
        System.out.println("You must pay 1st");
    }
}
