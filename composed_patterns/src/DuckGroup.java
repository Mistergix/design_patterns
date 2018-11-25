import java.util.ArrayList;

public class DuckGroup implements Quacker {
    private ArrayList<Quacker> quackers;

    DuckGroup() {
        this.quackers = new ArrayList<>();
    }

    void add(Quacker quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quacker q : quackers) {
            q.quack();
        }
    }
}
