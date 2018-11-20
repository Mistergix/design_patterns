public class TestDwarves {
    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.StartNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
