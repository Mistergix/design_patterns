public class Server {
    private CoffeShop coffeShop;
    private CrepeShop crepeShop;

    public Server(CoffeShop coffeShop, CrepeShop crepeShop) {
        this.coffeShop = coffeShop;
        this.crepeShop = crepeShop;
    }

    public void displayMenu() {
        displayMenu(coffeShop.getIterator());
        displayMenu(crepeShop.getIterator());
    }

    private void displayMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            Dish dish = (Dish) iterator.next();
            System.out.println(dish.getName());
            System.out.println(dish.getDescription());
            System.out.println(dish.getPrice());
        }
    }

}
