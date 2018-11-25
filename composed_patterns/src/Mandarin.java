public class Mandarin implements Quacker {
    Mandarin() {
        this.observable = new Observable(this);
    }

    private Observable observable;
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
