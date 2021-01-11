package III;

public class HouseBlend implements Beverage {
    @Override
    public String getDesc() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
