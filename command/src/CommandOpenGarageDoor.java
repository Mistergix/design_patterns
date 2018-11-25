public class CommandOpenGarageDoor implements Command {
    private Garage garage;

    CommandOpenGarageDoor(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void Execute() {
        garage.OpenDoor();
    }

    @Override
    public void Cancel() {
        garage.CloseDoor();
    }
}
