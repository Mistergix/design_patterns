public class IteratorCoffeeShop implements Iterator {
    private Dish[] dishes;
    private int position = 0;

    IteratorCoffeeShop(Dish[] dishes) {
        this.dishes = dishes;
    }

    @Override
    public boolean hasNext() {
        return !(position >= dishes.length || dishes[position] == null);
    }

    @Override
    public Object next() {
        return dishes[position++];
    }
}
