public class DuckLauncher {
    public static void main(String[] args) {
        Duck colvert = new Colvert();
        colvert.Fly();
        colvert.SetFlyBehavior(new CantFly());
        colvert.Fly();
    }
}