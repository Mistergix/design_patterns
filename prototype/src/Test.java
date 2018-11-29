public class Test {
    public static void main(String[] args) {
        ColorManager manager = new ColorManager();

        manager.setColorProtoype("white", new Color(255, 0, 0));

        ColorProtoype copy = manager.getColor("white").Clone();

    }
}
