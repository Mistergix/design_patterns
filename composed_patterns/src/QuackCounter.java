public class QuackCounter implements Quacker {
    private Quacker quacker;
    private static int count;
    private Observable observable;

    QuackCounter(Quacker quacker) {
        this.quacker = quacker;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        quacker.quack();
        count++;
        notifyObservers();
    }

    static int getCount() {
        return count;
    }

    @Override
    public void addObserver(Observer o) {
        observable.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
