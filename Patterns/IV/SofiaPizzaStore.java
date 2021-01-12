package IV;

import IV.pizza.Pizza;
import IV.pizza.SofiaCheesePizza;

public class SofiaPizzaStore extends PizzaStore {

    // Sofia type of pizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // needs validation

        if(type.equals("cheese")) {
            pizza = new SofiaCheesePizza();
        }
        // if (type...)
        // if (type...)
        return pizza;
    }
}
