package IV.factory;

import IV.ingredients.Cheese;

public class FranceIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        // another kind of cheese
        return null;
    }
}
