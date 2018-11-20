import java.util.ArrayList;

public class Menu extends Component {
    private ArrayList<Component> components;
    private String name;
    private String description;

    Menu(String name, String description) {
        this.name = name;
        this.description = description;
        components = new ArrayList<>();
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
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
    public void display() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------");

        for (Component component : components) {
            component.display();
        }
    }
}
