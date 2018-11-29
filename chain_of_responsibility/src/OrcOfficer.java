public class OrcOfficer extends RequestHandler {
    OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request req) {
        if (req.getRequestType().equals(Request.RequestType.TAX)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }

    }

    @Override
    public String toString() {
        return "Orc officer";
    }
}
