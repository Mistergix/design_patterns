public class Colvert implements Quacker {
    private Observable observable;

    Colvert() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack");
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
