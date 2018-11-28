public class TestWeapons {
    public static void main(String[] args) {
        Weapon sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();

        System.out.println("-----------");

        Weapon hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
