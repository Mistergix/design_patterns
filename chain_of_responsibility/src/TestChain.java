public class TestChain {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();

        king.makeRequest(new Request(Request.RequestType.DEFEND, "defend the princess"));
        king.makeRequest(new Request(Request.RequestType.TORTURE, "Torture the prisoner"));
        king.makeRequest(new Request(Request.RequestType.TAX, "Collect taxes"));
        king.makeRequest(new Request(Request.RequestType.EAT, "Eat what you can"));
    }
}
