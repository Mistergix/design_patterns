public class Dish extends Component {
    private String name, description;
    private boolean veggie;
    private double price;

    Dish(String name, String description, boolean veggie, double price) {
        this.name = name;
        this.description = description;
        this.veggie = veggie;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVeggie() {
        return veggie;
    }

    @Override
    public void display() {
        System.out.println(" " + getName());
        System.out.println(isVeggie() ? "Vegan" : "Not vegan");
        System.out.println(", " + getPrice());
        System.out.println("--" + getDescription());
    }
}
