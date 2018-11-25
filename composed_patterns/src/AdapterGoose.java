public class AdapterGoose implements Quacker {
    private Goose goose;

    AdapterGoose(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.carcarder();
    }
}
