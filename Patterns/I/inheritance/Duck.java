package I.inheritance;

public abstract class Duck {
    // why it is not the best approach

    // we need to implement methods that we are not sure how for every type

    // not every duck can quack
    // so we cannot implement it
    // but every Duck HAS SOME kind of speaking (quack)
    public abstract void quack();

    // not every duck can fly
    // if it is not flying the name will be the opposite of the behavior
    public abstract void fly();

    // we need to separate the problems (flying, quacking) from this class,
    // because it needs specific solution


    // if we inherit we will eventually violate open-closed principle
    // we will modify something, but not extend it when override

    // if we implement it in every subclass, we are going to have reapeated code, so again not the best decision

}
