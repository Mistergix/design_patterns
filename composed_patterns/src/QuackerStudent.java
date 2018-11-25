public class QuackerStudent implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println(duck + " Just quacked");
    }
}
