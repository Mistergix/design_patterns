public class TestTemplateMethod {
    public static void main(String[] args) {
        Drink tea = new Tea();
        Drink coffee = new Coffee();

        tea.followRecipe();

        System.out.println("---------------");

        coffee.followRecipe();
    }
}
