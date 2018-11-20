class Coffee extends Drink {
    @Override
    void addAccompaniements() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    void prepare() {
        System.out.println("Filtering coffee");
    }
}
