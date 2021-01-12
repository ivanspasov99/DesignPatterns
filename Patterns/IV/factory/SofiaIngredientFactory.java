package IV.factory;

import IV.ingredients.Cheese;

public class SofiaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        // one kind of cheese
        return null;
    }
}
