public class CandyMachine {
    private State empty;
    private State noCoin;
    private State hasCoin;
    private State sold;

    private State current;
    private int number;

    public CandyMachine(int number) {
        this.number = number;
        empty = new StateEmpty(this);
        noCoin = new StateNoCoin(this);
        hasCoin = new StateHasCoin(this);
        sold = new StateSold(this);

        current = empty;
        if (number > 0) {
            current = noCoin;
        }
    }

    public void insertCoin() {
        current.insertCoin();
    }

    public void removeCoin() {
        current.removeCoin();
    }

    public void rotateHandle() {
        current.rotateHandle();
        current.deliver();
    }

    void setState(State current) {
        this.current = current;
    }

    State getEmpty() {
        return empty;
    }

    State getNoCoin() {
        return noCoin;
    }

    public int getNumber() {
        return number;
    }

    boolean isEmpty() {
        return number <= 0;
    }

    State getHasCoin() {
        return hasCoin;
    }

    State getSold() {
        return sold;
    }

    void free() {
        System.out.println("A candy goes out");
        if (number > 0) {
            number--;
        }
    }
}
