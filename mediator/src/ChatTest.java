public class ChatTest {
    public static void main(String[] args) {
        Chatroom chatroom = new ConcreteChatroom();

        Participant yoko = new NonBeatle("Yoko");
        Participant george = new Beatle("George");
        Participant paul = new Beatle("Paul");

        chatroom.register(george);
        chatroom.register(paul);
        chatroom.register(yoko);

        yoko.send(george.getName(), "Hello George");
        paul.send(yoko.getName(), "Hello yoko, george is dead, eaten by big bees");
    }
}
