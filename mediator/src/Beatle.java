class Beatle extends Participant {
    Beatle(String name) {
        super(name);
    }

    @Override
    void receive(String from, String message) {
        System.out.println("To a Beatle");
        super.receive(from, message);
    }
}
