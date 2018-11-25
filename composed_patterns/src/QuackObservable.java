
public interface QuackObservable {
    void addObserver(Observer o);

    void notifyObservers();
}
