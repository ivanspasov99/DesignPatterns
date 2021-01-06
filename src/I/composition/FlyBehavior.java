package I.composition;

// can be implemented: flyWithWings, FlyNo, flyWithCostume, flyWithRocket.......
// we can use this object in Every Object that has flying behavior, so we will separate flying behavior
// and the Duck class wont need to care about it
public interface FlyBehavior {
    public void fly();
}
