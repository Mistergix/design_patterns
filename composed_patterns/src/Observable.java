import java.util.ArrayList;

public class Observable implements QuackObservable {
    private ArrayList<Observer> observers;
    private QuackObservable quackObservable;

    Observable(QuackObservable quackObservable) {
        this.observers = new ArrayList<>();
        this.quackObservable = quackObservable;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(quackObservable);
        }

    }
}
