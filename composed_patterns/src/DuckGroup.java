import java.util.ArrayList;

public class DuckGroup implements Quacker {
    private Observable observable;

    @Override
    public void addObserver(Observer o) {
        observable.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    private ArrayList<Quacker> quackers;

    DuckGroup() {
        this.quackers = new ArrayList<>();
        this.observable = new Observable(this);
    }

    void add(Quacker quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quacker q : quackers) {
            q.quack();
            notifyObservers();
        }
    }
}
