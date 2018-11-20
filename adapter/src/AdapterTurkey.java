public class AdapterTurkey implements Duck// we want to adapt the turkey to the duck, the adapter implements the thing in which we want to adapt
{
    private Turkey turkey;

    AdapterTurkey(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly(); // we do it a lot of time beacause the turkey can't fly a lot
        }
    }

    @Override
    public void quack() {
        turkey.gluglu();
    }
}
