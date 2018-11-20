public class PizzaCheeseParis extends Pizza {
    public PizzaCheeseParis() {
        super("Pizza parisienne", "Thick pastry", "Tomato");
        addAccompaniement("Mozzarella");
        addAccompaniement("Basilic");
    }

    @Override
    void cut() {
        System.out.println("Slicing in rectangular pieces");
    }
}
