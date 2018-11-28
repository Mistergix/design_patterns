public class TestBuilder {
    public static void main(String[] args) {
        Hero hero = new Hero.HeroBuilder("Wizard", "Harry Potter").withHairColo("Dark").build();

        System.out.println(hero);
    }
}
