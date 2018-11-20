public class TestMenu {
    public static void main(String[] args) {
        Component creperie = new Menu("CREPERIE", "Brunch");
        Component cafet = new Menu("CAFETERIA", "Déjeuner");
        Component brasserie = new Menu("BRASSERIE", "Diner");
        Component desserts = new Menu("DESSERTS", "Seulement les desserts !");

        Component root = new Menu("TOUS LES MENUS", "Toutes nos offres");

        root.add(creperie);
        root.add(cafet);
        root.add(brasserie);

        cafet.add(new Dish("Pasta al Pesto", "Spaghetti, Pignon, Ail, Basilic", true, 3.89));
        cafet.add(desserts); // only the cafet has desserts

        desserts.add(new Dish("Tiramisu", "Crème, café, boudoirs", true, 2.20));

        creperie.add(new Dish("Crêpe oeuf", "Oeuf, jambon", false, 1.99));

        brasserie.add(new Dish("Salade César", "Poulet, salade", false, 3.99));

        Server server = new Server(root);

        server.display();
    }
}
