public class CommandCloseGarageDoor implements Command {
    private Garage garage;

    CommandCloseGarageDoor(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void Execute() {
        garage.CloseDoor();
    }
}
