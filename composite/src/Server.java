class Server {
    private Component root;

    Server(Component root) {
        this.root = root;
    }

    void display() {
        root.display();
    }
}
