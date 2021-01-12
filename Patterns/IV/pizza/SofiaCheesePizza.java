package IV.pizza;

import IV.factory.PizzaIngredientFactory;

public class SofiaCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public SofiaCheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    // so we are creating the specific cheese from ingredientFactory that we are not depending on (decoupled)
    @Override
    public void prepare() {
        cheese = ingredientFactory.createCheese();
    }
}
