public class FactoryDucks extends AbstractFactoryDucks {
    @Override
    Quacker createColvert() {
        return new Colvert();
    }

    @Override
    Quacker createMandarin() {
        return new Mandarin();
    }

    @Override
    Quacker createFake() {
        return new FakeDuck();
    }

    @Override
    Quacker createPlastic() {
        return new PlasticDuck();
    }
}
