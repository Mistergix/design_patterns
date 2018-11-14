public class MacroCommand implements Command {
    private Command[] commands;

    MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void Execute() {
        for (Command c : commands) {
            c.Execute();
        }
    }

    @Override
    public void Cancel() {
        for (Command c : commands) {
            c.Cancel();
        }
    }
}
