import java.util.ArrayList;

public abstract class Pizza // all the pizzas must inherits from this class
{
    private String name;
    private String pastry;
    private String sauce;
    private ArrayList<String> accompaniments;

    Pizza(String name, String pastry, String sauce) {
        this.name = name;
        this.pastry = pastry;
        this.sauce = sauce;
        this.accompaniments = new ArrayList<>();
    }

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Pastry " + pastry);
        System.out.println("Adding sauce : " + sauce);
        for (String accompaniement : accompaniments) {
            System.out.println("Adding " + accompaniement);
        }
    }

    void cook() {
        System.out.println("Cooking at 180°");
    }

    void cut() {
        System.out.println("Cutting in triangular slices");
    }

    void packaging() {
        System.out.println("Packaging in a box");
    }

    public String getName() {
        return name;
    }

    void addAccompaniement(String accompaniement) {
        this.accompaniments.add(accompaniement);
    }
}
