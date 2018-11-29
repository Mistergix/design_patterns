// the caretaker
class ProspectMemory {
    private Memento memento;

    ProspectMemory(Memento memento) {
        this.memento = memento;
    }

    Memento getMemento() {
        return memento;
    }
}
