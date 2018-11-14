public abstract class Drink {

    String description = "Unknow drink";

    public String GetDescription() {
        return description;
    }

    public abstract double Cost();

    void Display() {
        System.out.println("Description : " + GetDescription());
        System.out.println("Cost " + Cost());
    }
}
