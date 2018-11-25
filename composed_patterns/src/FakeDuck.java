public class FakeDuck implements Quacker {
    private Observable observable;

    FakeDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Couac Couac");
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
