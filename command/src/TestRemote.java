public class TestRemote {
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        Lamp lamp = new Lamp();
        Garage garage = new Garage();

        Command command1 = new CommandOpenGarageDoor(garage);
        Command command2 = new CommandCloseGarageDoor(garage);
        Command command3 = new CommandSwitchOnLamp(lamp);
        Command command4 = new CommandSwitchOffLamp(lamp);

        remote.setCommand(0, command1, command2);
        remote.setCommand(1, command3, command4);

        remote.Off(0);
        remote.Cancel();
        remote.On(1);
        remote.Cancel();
    }
}
