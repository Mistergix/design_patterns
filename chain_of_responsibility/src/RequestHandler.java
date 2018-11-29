abstract class RequestHandler {
    private RequestHandler next;

    RequestHandler(RequestHandler next) {
        this.next = next;
    }

    void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    void printHandling(Request req) {
        System.out.println("Handling " + req);
    }

    @Override
    public abstract String toString();
}
