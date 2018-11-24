public class StateHasCoin implements State {
    private CandyMachine candyMachine;

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
        candyMachine.setState(candyMachine.getSold());
    }

    @Override
    public void deliver() {
        System.out.println("No candy delivered");
    }
}
