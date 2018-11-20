class PizzeriaParis extends Pizzeria {
    @Override
    Pizza createPiza(String type) {
        switch (type) {
            case "cheese":
                return new PizzaCheeseParis();
            default:
                return new NoPizza();
        }
    }
}
