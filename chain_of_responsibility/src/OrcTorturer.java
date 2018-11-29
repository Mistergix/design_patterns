public class OrcTorturer extends RequestHandler {
    OrcTorturer(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request req) {
        if (req.getRequestType().equals(Request.RequestType.TORTURE)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Orc torturer";
    }
}
