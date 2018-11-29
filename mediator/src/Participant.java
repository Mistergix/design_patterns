// consumer
abstract class Participant {
    private Chatroom chatroom;
    private String name;

    Participant(String name) {
        this.name = name;
    }

    void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    String getName() {
        return name;
    }

    final void send(String to, String message) {
        chatroom.send(name, to, message);
    }

    void receive(String from, String message) {
        System.out.println(from + " to " + name + " : " + message);
    }
}

