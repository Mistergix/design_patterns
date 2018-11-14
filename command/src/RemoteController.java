class RemoteController {
    private Command[] commandsOn, commandsOff;

    RemoteController() {
        int maxCommands = 3;
        commandsOff = new Command[maxCommands];
        commandsOn = new Command[maxCommands];

        Command nullCommand = new CommandNull(); // do nothing by default
        for (int i = 0; i < maxCommands; i++) {
            commandsOn[i] = commandsOff[i] = nullCommand;
        }
    }

    void setCommand(int index, Command on, Command off) {
        commandsOff[index] = off;
        commandsOn[index] = on;
    }

    void On(int index) {
        commandsOn[index].Execute();
    }

    void Off(int index) {
        commandsOff[index].Execute();
    }
}
