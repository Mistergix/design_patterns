public class OrcCommander extends RequestHandler {
    OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request req) {
        if (req.getRequestType().equals(Request.RequestType.DEFEND)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
