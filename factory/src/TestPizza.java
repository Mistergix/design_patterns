public class TestPizza {
    public static void main(String[] args) {
        Pizzeria brest = new PizzeriaBrest();
        Pizzeria paris = new PizzeriaParis();

        Pizza pizza = brest.orderPizza("cheese");
        System.out.println("Pizza : " + pizza.getName());

        pizza = paris.orderPizza("cheese");
        System.out.println("Pizza : " + pizza.getName());

        pizza = paris.orderPizza("wtf");
        System.out.println("Pizza : " + pizza.getName());
    }
}
