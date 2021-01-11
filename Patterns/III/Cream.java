package III;

public class Cream extends CondimentDecorator {

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
