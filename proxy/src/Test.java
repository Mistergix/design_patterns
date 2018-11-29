public class Test {
    public static void main(String[] args) {
        Field realField = new RealField();
        System.out.println(realField.Div(10, 2));
        System.out.println(realField.Div(10, 0));

        Field proxy = new ProxyField(realField);

        System.out.println(proxy.Div(10, 0));
    }
}
