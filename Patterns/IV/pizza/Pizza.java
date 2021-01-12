package IV.pizza;

import IV.factory.PizzaIngredientFactory;
import IV.ingredients.Cheese;

public abstract class Pizza {
    Cheese cheese;

    public abstract void prepare();

    public void bake() { }
    public void cut() { }
    public void box() { }
}
