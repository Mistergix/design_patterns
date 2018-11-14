public class CommandSwitchOnLamp implements Command // that's one command/Button/Action
{
    private Lamp lamp; // the object on wich we want to operate

    CommandSwitchOnLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void Execute() {
        lamp.On(); // we delegate the execute to one of the object's method
    }
}
