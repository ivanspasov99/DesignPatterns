package IV;

import IV.pizza.Pizza;

public abstract class PizzaStore {

    // Order Pizza has now idea what real concrete pizza are involved
    // They are decoupled
    // type is "cheese..."
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // object creation
    // decoupled form PizzaStore main logic
    // this could to the pizza factory class if the process of creating object is complex
    abstract Pizza createPizza(String type);
}
