public class AdapterGoose implements Quacker {
    private Observable observable;
    private Goose goose;

    AdapterGoose(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.carcarder();
        notifyObservers();
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
