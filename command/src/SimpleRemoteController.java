class SimpleRemoteController {
    private Command command; // one of the remote button

    void setCommand(Command command) {
        this.command = command;
    }

    void ButtonPressed() {
        command.Execute();
    }
}
