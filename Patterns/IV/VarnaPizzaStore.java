package IV;

import IV.pizza.Pizza;
import IV.pizza.VarnaCheesePizza;

public class VarnaPizzaStore extends PizzaStore {

    // Varna type of pizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        // needs validation
        if(type.equals("cheese")) {
            pizza = new VarnaCheesePizza();
        }
        // if (type...)
        // if (type...)
        return pizza;
    }
}
