import java.util.ArrayList;

public class IteratorCrepeShop implements Iterator {
    private ArrayList<Dish> dishes;
    private int position;

    IteratorCrepeShop(ArrayList<Dish> dishes) {
        this.dishes = dishes;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < dishes.size();
    }

    @Override
    public Object next() {
        return dishes.get(position++);
    }
}
