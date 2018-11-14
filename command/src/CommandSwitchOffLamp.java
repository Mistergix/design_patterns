public class CommandSwitchOffLamp implements Command // that's one command/Button/Action
{
    private Lamp lamp; // the object on wich we want to operate

    CommandSwitchOffLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void Execute() {
        lamp.Off(); // we delegate the execute to one of the object's method
    }
}
