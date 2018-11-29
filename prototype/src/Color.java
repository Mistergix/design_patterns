public class Color implements ColorProtoype {
    private int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public ColorProtoype Clone() {
        return new Color(r, g, b);
    }
}
