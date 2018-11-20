public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() + " Moves chunks of gold out of the mine");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
