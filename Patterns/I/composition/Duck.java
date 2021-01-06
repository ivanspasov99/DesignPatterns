package I.composition;

public abstract class Duck {
    // here are different approaches for setting the variables
    // We can set them with final, because it is not meant to change
    // We can set them withing the constructor
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    // we are creating composition
    // we isolate the whole FlyBehavior, so we do not care about implementation and the problems
    // that resolves

    Duck() {
        //
    }

    // when we extend the class we include:

    // interfaces that isolate specific behavior/logic/problem
        // FlyBehavior
        // can be implemented: flyWithWings, FlyNo, flyWithCostume, flyWithRocket.......
        // we can use this object in Every Object that has flying behavior, so we will separate flying behavior
        // and the Duck class wont need to care about it

    // external behaviors that are isolated in self classes
    // things that are COMMON and applies for all ducks
    // we won't need to override some kind of LOGIC (if override fly function in inheritance package),
    // because it violates OPEN-ClOSED PRINCIPLE
}
