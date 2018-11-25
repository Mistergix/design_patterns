public class QuackCounter implements Quacker {
    private Quacker quacker;
    private static int count;

    QuackCounter(Quacker quacker) {
        this.quacker = quacker;
    }

    @Override
    public void quack() {
        quacker.quack();
        count++;
    }

    static int getCount() {
        return count;
    }
}
