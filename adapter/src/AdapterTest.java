public class AdapterTest {
    public static void main(String[] args) {
        Duck colvert = new Colvert();

        Turkey wildTurkey = new WildTurkey();
        Duck adpatedTurkey = new AdapterTurkey(wildTurkey);

        colvert.fly();
        colvert.quack();

        wildTurkey.fly();
        wildTurkey.gluglu();

        adpatedTurkey.fly();
        adpatedTurkey.quack();
    }
}
