public class OrcishKingdomFactory implements KingdomFactory { // the orcish way
    @Override
    public Castle createCastle() {
        return new OrcishCastle();
    }

    @Override
    public King createKing() {
        return new OrcishKing();
    }

    @Override
    public Army createArmy() {
        return new OrcishArmy();
    }
}
