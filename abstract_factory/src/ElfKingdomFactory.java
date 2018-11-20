public class ElfKingdomFactory implements KingdomFactory { // the elven way
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElvenArmy();
    }
}
