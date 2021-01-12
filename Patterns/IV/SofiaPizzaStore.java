package IV;

import IV.factory.PizzaIngredientFactory;
import IV.pizza.Pizza;
import IV.pizza.SofiaCheesePizza;

public class SofiaPizzaStore extends PizzaStore {

    // if store only work with specific ingredientFactory could be done manually
    // if we need to be flexible we can create setIngredientFactory() -> so we can change the factory
    public SofiaPizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Sofia type of pizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // needs validation

        if(type.equals("cheese")) {
            pizza = new SofiaCheesePizza(ingredientFactory);
        }
        // if (type...)
        // if (type...)
        return pizza;
    }

}
