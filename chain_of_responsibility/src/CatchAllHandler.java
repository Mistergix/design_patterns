public class CatchAllHandler extends RequestHandler {
    CatchAllHandler(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request req) {
        System.out.println("Default handler");
        printHandling(req);
        req.markHandled();
    }

    @Override
    public String toString() {
        return "Catch all";
    }
}
