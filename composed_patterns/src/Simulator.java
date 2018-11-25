public class Simulator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.simulate();
    }

    private void simulate() {
        Quacker colvert = new QuackCounter(new Colvert());
        Quacker mandarin = new QuackCounter(new Mandarin());
        Quacker fake = new QuackCounter(new FakeDuck());
        Quacker plastic = new QuackCounter(new PlasticDuck());
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
