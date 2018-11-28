public class CandyMachine {
    private State empty;
    private State noCoin;
    private State hasCoin;
    private State sold;
    private State winner;

    State getWinner() {
        return winner;
    }

    private State current;
    private int number;

    CandyMachine(int number) {
        this.number = number;
        empty = new StateEmpty(this);
        noCoin = new StateNoCoin(this);
        hasCoin = new StateHasCoin(this);
        sold = new StateSold(this);
        winner = new StateWinner(this);

        current = empty;
        if (number > 0) {
            current = noCoin;
        }
    }

    void insertCoin() {
        current.insertCoin();
    }

    public void removeCoin() {
        current.removeCoin();
    }

    void rotateHandle() {
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

    int getNumber() {
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
