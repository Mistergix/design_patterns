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

        simulate(colvert);
        simulate(mandarin);
        simulate(fake);
        simulate(plastic);
        simulate(gooseQuacker); // we can treat the goose as a quacker

        System.out.println("Counted : " + QuackCounter.getCount());
    }

    private void simulate(Quacker q) {
        q.quack();
    }
}
