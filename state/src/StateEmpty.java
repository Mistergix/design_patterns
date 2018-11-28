public class StateEmpty implements State {
    private CandyMachine candyMachine;

    StateEmpty(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void removeCoin() {
        System.out.println("cannot do this");
    }

    @Override
    public void insertCoin() {
        System.out.println("cannot do this");
    }

    @Override
    public void rotateHandle() {
        System.out.println("cannot do this");
    }

    @Override
    public void deliver() {
        System.out.println("cannot do this");
    }
}
