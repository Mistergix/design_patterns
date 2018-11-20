public class Test {
    public static void main(String[] args) {
        CrepeShop crepeShop = new CrepeShop();
        CoffeShop coffeShop = new CoffeShop();

        Server server = new Server(coffeShop, crepeShop);

        server.displayMenu();
    }
}
