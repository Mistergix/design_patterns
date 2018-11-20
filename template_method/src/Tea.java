public class Tea extends Drink {
    @Override
    void addAccompaniements() {
        System.out.println("Adding lemon");
    }

    @Override
    void prepare() {
        System.out.println("Infusing tea");
    }

    @Override
    public boolean wantsAccompaniements() {
        return false; // don't want it
    }
}
