import java.util.Hashtable;

public class ConcreteChatroom implements Chatroom {
    private Hashtable<String, Participant> participants;

    ConcreteChatroom() {
        participants = new Hashtable<>();
    }

    @Override
    public void register(Participant p) {
        if (!participants.contains(p)) {
            participants.put(p.getName(), p);
            p.setChatroom(this);
        }
    }

    @Override
    public void send(String from, String to, String message) {
        Participant p = participants.get(to);
        if (p != null) {
            p.receive(from, message);
        }

    }
}
