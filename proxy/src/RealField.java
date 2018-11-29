public class RealField implements Field {
    @Override
    public double Add(double x, double y) {
        return x + y;
    }

    @Override
    public double Sub(double x, double y) {
        return x - y;
    }

    @Override
    public double Mul(double x, double y) {
        return x * y;
    }

    @Override
    public double Div(double x, double y) {
        return x / y;
    }
}
