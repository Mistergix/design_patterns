class NonBeatle extends Participant {
    @Override
    void receive(String from, String message) {
        System.out.println("To a non-beatle : ");
        super.receive(from, message);
    }

    NonBeatle(String name) {
        super(name);
    }
}
