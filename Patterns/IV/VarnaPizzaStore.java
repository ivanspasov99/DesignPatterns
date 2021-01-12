package IV;

import IV.factory.PizzaIngredientFactory;
import IV.factory.SofiaIngredientFactory;
import IV.pizza.Pizza;
import IV.pizza.VarnaCheesePizza;

public class VarnaPizzaStore extends PizzaStore {

    public VarnaPizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // Varna type of pizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // needs validation
        if(type.equals("cheese")) {
            pizza = new VarnaCheesePizza(ingredientFactory);
        }
        // if (type...)
        // if (type...)
        return pizza;
    }
}
