public class TestSimpleRemote {
    public static void main(String[] args) {
        SimpleRemoteController remote = new SimpleRemoteController(); // Invoker
        Lamp lamp = new Lamp(); // receptor
        Command lampOn = new CommandSwitchOnLamp(lamp); // the command

        remote.setCommand(lampOn);
        remote.ButtonPressed();

        Garage garage = new Garage();
        Command garageDoor = new CommandOpenGarageDoor(garage);

        remote.setCommand(garageDoor);
        remote.ButtonPressed();
    }
}
