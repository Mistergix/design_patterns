public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + " Creates another tunnel");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}
