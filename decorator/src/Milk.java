public class Milk extends DecoratorIngredient {
    public Milk(Drink drink) {
        super(drink, .10, "Milk");
    }
}
