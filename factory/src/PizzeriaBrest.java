public class PizzeriaBrest extends Pizzeria {
    @Override
    Pizza createPiza(String type) {
        switch (type) {
            case "cheese":
                return new PizzaCheeseBrest();
            default:
                return new NoPizza();
        }
    }
}
