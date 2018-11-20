class Server {
    private CoffeShop coffeShop;
    private CrepeShop crepeShop;

    Server(CoffeShop coffeShop, CrepeShop crepeShop) {
        this.coffeShop = coffeShop;
        this.crepeShop = crepeShop;
    }

    void displayMenu() {
        displayMenu(coffeShop.getIterator());
        displayMenu(crepeShop.getIterator());
    }

    private void displayMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Dish dish = (Dish) iterator.next();
            System.out.println(dish.getName());
            System.out.println(dish.getDescription());
            System.out.println(dish.getPrice());
            System.out.println(dish.isVeggie() ? "Vegan" : "Not vegan");
            System.out.println("-----------");
        }
    }

}
