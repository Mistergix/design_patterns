import java.util.Hashtable;

class ColorManager {
    private Hashtable<String, ColorProtoype> colorProtoypes;

    ColorManager() {
        colorProtoypes = new Hashtable<>();
    }

    ColorProtoype getColor(String name) {
        return colorProtoypes.get(name); // not safe but anyway
    }

    void setColorProtoype(String name, ColorProtoype c) {
        colorProtoypes.put(name, c);
    }
}
