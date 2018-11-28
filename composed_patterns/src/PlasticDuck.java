public class PlasticDuck implements Quacker {
    private Observable observable;

    PlasticDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Couic");
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
