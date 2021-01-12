package IV.factory;

import IV.ingredients.Cheese;

public interface PizzaIngredientFactory {
    Cheese createCheese();

    // multiple methods that implements same product but in a different way (taste in out case)
}
