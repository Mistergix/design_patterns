public class FactoriesTest {
    public static void main(String[] args) {
        FactoryMaker maker = new FactoryMaker();
        KingdomFactory elf = maker.makeFactory(FactoryMaker.KingdomType.ELF);

        Army elvenArmy = elf.createArmy();

        KingdomFactory orc = maker.makeFactory(FactoryMaker.KingdomType.ORC);

        Army orcishArmy = orc.createArmy();

        System.out.println("This is " + elvenArmy.getDescription() + " VS " + orcishArmy.getDescription());
    }
}
