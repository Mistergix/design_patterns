public abstract class Drink {
    private String description = "Boisson inconnue";

    public String GetDescription() {
        return description;
    }

    public abstract double Cost();
}
