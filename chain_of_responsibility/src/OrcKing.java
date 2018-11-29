class OrcKing {
    private RequestHandler chain;

    OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcTorturer(new CatchAllHandler(null))));
    }

    void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}
