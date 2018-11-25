public abstract class DecoratorIngredient extends Drink {

    private double cost;
    private Drink drink;
    private String description;

    DecoratorIngredient(Drink drink, double cost, String description) {
        this.drink = drink;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public double Cost() {
        return cost + drink.Cost();
    }

    @Override
    public String GetDescription() {
        return drink.GetDescription() + ", " + description;
    }
}
