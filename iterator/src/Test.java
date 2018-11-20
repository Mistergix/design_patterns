public class Test {
    public static void main(String[] args) {
        Menu crepeShop = new CrepeShop();
        Menu coffeShop = new CoffeShop();

        Server server = new Server(coffeShop, crepeShop);

        server.displayMenu();
    }
}
