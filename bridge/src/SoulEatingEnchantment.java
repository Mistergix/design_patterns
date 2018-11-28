public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onDeactivate() {
        System.out.println("Bloodlust disappears");
    }

    @Override
    public void apply() {
        System.out.println("Eats the soul");
    }

    @Override
    public void onActivate() {
        System.out.println("Spreads bloodlust");
    }
}
