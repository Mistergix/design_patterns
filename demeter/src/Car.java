public class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void Start(Key key) {
        Doors doors = new Doors();
        if (key.permits()) // i can cll a method form a parameter
        {
            engine.start(); // i can call a method from a component of the class
            turnOnDisplay(); // i can call a method from the class itself
            doors.close(); // i can call a method from a objet created here
        }

    }

    private void turnOnDisplay() {
        System.out.println("Display is turned on");
    }
}
