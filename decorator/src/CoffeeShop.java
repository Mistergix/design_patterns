public class CoffeeShop {
    public static void main(String[] args) {
        Drink drink = new Expresso();
        drink.Display();

        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        drink = new Milk(drink);

        drink.Display();
    }
}
