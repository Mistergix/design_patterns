public abstract class Pizzeria {
    // defining a method in an abstract class : the super class dosn't know which sub class will actually create the pizza
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPiza(type); // all the method knows is that it will receive an object that can be prepared, cooked etc.

        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.packaging();

        return pizza;
    }

    // All the creation is delegated to the subclasses
    // the method is abtract so the subclasses MUST do it
    // form : abstract Product create(Object type)
    // we can parameterize with an argument (enum, object, string (not recommended))
    abstract Pizza createPiza(String type);
}
