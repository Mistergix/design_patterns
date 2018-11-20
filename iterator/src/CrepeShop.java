import java.util.ArrayList;

public class CrepeShop {
    private ArrayList<Dish> dishes;

    public CrepeShop() {
        dishes = new ArrayList<>();

        addDish(new Dish("Crêpe à l'oeuf", "With an egg", true, 2.99));
        addDish(new Dish("Crêpe au boeuf", "With beef", false, 3.99));
        addDish(new Dish("Crêpe forestière", "With blueberries", true, 1.99));
    }

    private void addDish(Dish dish) {
        dishes.add(dish);
    }

    Iterator getIterator() {
        return new IteratorCrepeShop(dishes);
    }
}
