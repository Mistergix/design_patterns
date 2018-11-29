public class MementoTest {
    public static void main(String[] args) {
        SalesProspect prospect = new SalesProspect("Jean", "0601020304");
        ProspectMemory memory = new ProspectMemory(prospect.saveMemento());

        prospect.setPhone("0601");

        prospect.restoreMemento(memory.getMemento());


    }
}
