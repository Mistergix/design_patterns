// the mediator isolates the interactions
interface Chatroom {
    void register(Participant p);

    void send(String from, String to, String message);
}
