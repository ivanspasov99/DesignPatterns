package IV;

import IV.factory.PizzaIngredientFactory;
import IV.pizza.Pizza;

public abstract class PizzaStore {
    PizzaIngredientFactory ingredientFactory;

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

    // created because the PizzaStore could use another Ingredients Factory for the different season let's say
    public void setIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // object creation
    // decoupled form PizzaStore main logic
    // this could to the pizza factory class if the process of creating object is complex
    abstract Pizza createPizza(String type);

}
