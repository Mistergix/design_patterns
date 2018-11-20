public abstract class DwarvenMineWorker {

    private void goToSleep() {
        System.out.println(name() + " goes to sleep");
    }

    private void wakeUp() {
        System.out.println(name() + " wakes up");
    }

    private void goHome() {
        System.out.println(name() + " goes home");
    }

    private void goToMine() {
        System.out.println(name() + " goes to the mine");
    }

    private void action(Action action) {
        switch (action) {
            case WORK:
                work();
                break;
            case SLEEP:
                goToSleep();
                break;
            case GO_HOME:
                goHome();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            default:
                System.out.println("Undefined");
        }
    }

    void action(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

    public abstract void work();

    public abstract String name();

    enum Action {
        SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
