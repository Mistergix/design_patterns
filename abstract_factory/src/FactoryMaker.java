public class FactoryMaker {
    public enum KingdomType {
        ELF,
        ORC,
    }

    public KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcishKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not Supported");
        }
    }
}
