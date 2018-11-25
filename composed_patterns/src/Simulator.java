public class Simulator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.simulate();
    }

    private void simulate() {
        Quacker colvert = new Colvert();
        Quacker mandarin = new Mandarin();
        Quacker fake = new FakeDuck();
        Quacker plastic = new PlasticDuck();

        simulate(colvert);
        simulate(mandarin);
        simulate(fake);
        simulate(plastic);
    }

    private void simulate(Quacker q) {
        q.quack();
    }
}
