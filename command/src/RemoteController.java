class RemoteController {
    private Command[] commandsOn, commandsOff;
    private Command lastCancelCommand;

    RemoteController() {
        int maxCommands = 3;
        commandsOff = new Command[maxCommands];
        commandsOn = new Command[maxCommands];

        Command nullCommand = new CommandNull(); // do nothing by default
        for (int i = 0; i < maxCommands; i++) {
            commandsOn[i] = commandsOff[i] = nullCommand;
        }
        lastCancelCommand = nullCommand;
    }

    void setCommand(int index, Command on, Command off) {
        commandsOff[index] = off;
        commandsOn[index] = on;
    }

    void On(int index) {
        commandsOn[index].Execute();
        lastCancelCommand = commandsOn[index];
    }

    void Off(int index) {
        commandsOff[index].Execute();
        lastCancelCommand = commandsOff[index];
    }

    void Cancel() {
        lastCancelCommand.Cancel();
    }
}
