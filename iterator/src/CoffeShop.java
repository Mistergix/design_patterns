class CoffeShop {
    private static final int MAX = 6;
    private int count = 0;
    private Dish[] dishes;

    public CoffeShop() {
        dishes = new Dish[MAX];

        addDish(new Dish("Salad", "Tomatoes, Cucumber, Potatoes", true, 2.99));
        addDish(new Dish("Quiche Lorraine", "Pork, Milk", false, 4.99));
    }

    private void addDish(Dish dish) {
        if (count >= MAX) {
            System.err.println("Full menu");
        } else {
            dishes[count++] = dish;
        }
    }

    public Dish[] getDishes() {
        return dishes;
    }
}


