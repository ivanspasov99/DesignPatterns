package III;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
