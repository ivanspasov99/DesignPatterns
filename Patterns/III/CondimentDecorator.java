package III;

public abstract class CondimentDecorator implements Beverage {
    Beverage beverage;

    public abstract String getDesc();
}
