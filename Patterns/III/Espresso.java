package III;

public class Espresso implements Beverage {

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
