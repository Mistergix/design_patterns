public class ProxyField implements Field {
    private Field field;

    ProxyField(Field field) {
        this.field = field;
    }

    @Override
    public double Add(double x, double y) {
        return field.Add(x, y);
    }

    @Override
    public double Sub(double x, double y) {
        return field.Sub(x, y);
    }

    @Override
    public double Mul(double x, double y) {
        return field.Mul(x, y);
    }

    @Override
    public double Div(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Zero isn't allowed");
        }

        return x / y;
    }
}
