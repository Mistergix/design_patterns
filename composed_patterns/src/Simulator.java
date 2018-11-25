public class Simulator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        AbstractFactoryDucks factory = new FactoryDucksCounting();
        simulator.simulate(factory); // adding the factory to be able to change the family of ducks
    }

    private void simulate(AbstractFactoryDucks factoryDucks) {
        Quacker colvert = factoryDucks.createColvert();
        Quacker mandarin = factoryDucks.createMandarin();
        Quacker fake = factoryDucks.createFake();
        Quacker plastic = factoryDucks.createPlastic();
        Quacker gooseQuacker = new AdapterGoose(new Goose()); // we don't want to count the geese quacks

        DuckGroup groupOfDucks = new DuckGroup();
        groupOfDucks.add(fake);
        groupOfDucks.add(mandarin);
        groupOfDucks.add(plastic);
        groupOfDucks.add(gooseQuacker);

        DuckGroup groupOfColverts = new DuckGroup();
        groupOfColverts.add(colvert);
        groupOfColverts.add(factoryDucks.createColvert());
        groupOfColverts.add(factoryDucks.createColvert());
        groupOfColverts.add(factoryDucks.createColvert());

        groupOfDucks.add(groupOfColverts); // added the group to another one

        QuackerStudent student = new QuackerStudent();
        groupOfDucks.addObserver(student);

        simulate(groupOfDucks); // on all quackers

        System.out.println("Counted : " + QuackCounter.getCount());
    }

    private void simulate(Quacker q) {
        q.quack();
    }
}
