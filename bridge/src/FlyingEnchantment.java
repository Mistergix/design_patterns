public class FlyingEnchantment implements Enchantment {
    @Override
    public void onDeactivate() {
        System.out.println("The item fades");
    }

    @Override
    public void apply() {
        System.out.println("The item flies ad strikes the ennemy");
    }

    @Override
    public void onActivate() {
        System.out.println("The item glows");
    }
}
