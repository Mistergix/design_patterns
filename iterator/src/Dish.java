public class Dish {
    private String name;
    private String description;
    private boolean veggie;
    private double price;

    public Dish(String name, String description, boolean veggie, double price) {
        this.name = name;
        this.description = description;
        this.veggie = veggie;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVeggie() {
        return veggie;
    }

    public double getPrice() {
        return price;
    }
}
