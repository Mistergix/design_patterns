// uses the memento
class SalesProspect {
    private String name;

    SalesProspect(String name, String phone) {
        setName(name);
        setPhone(phone);
    }

    private String phone;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
        System.out.println(phone);
    }

    Memento saveMemento() {
        System.out.println("Saving");
        return new Memento(getName(), getPhone());
    }

    void restoreMemento(Memento memento) {
        setName(memento.getName());
        setPhone(memento.getPhone());
    }
}
