import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class DwarvenGoldmineFacade {
    private final List<DwarvenMineWorker> workers;

    DwarvenGoldmineFacade() {
        this.workers = new ArrayList<>();
        workers.add(new DwarvenGoldDigger());
        workers.add(new DwarvenCartOperator());
        workers.add(new DwarvenTunnelDigger());
    }

    void StartNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.SLEEP);
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        for (DwarvenMineWorker worker : workers) {
            worker.action(actions);
        }
    }
}
