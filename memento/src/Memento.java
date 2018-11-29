class Memento {
    private String name;
    private String phone;

    Memento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }
}
