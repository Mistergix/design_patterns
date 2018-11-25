class FactoryDucksCounting extends AbstractFactoryDucks {
    @Override
    Quacker createColvert() {
        return new QuackCounter(new Colvert());
    }

    @Override
    Quacker createMandarin() {
        return new QuackCounter(new Mandarin());
    }

    @Override
    Quacker createFake() {
        return new QuackCounter(new FakeDuck());
    }

    @Override
    Quacker createPlastic() {
        return new QuackCounter(new PlasticDuck());
    }
}
