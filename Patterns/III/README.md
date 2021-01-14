## Decorator Pattern
**Structural Pattern**


> look at the pictures first

### Idea:
- Is to wrap object into another. 
The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects in the same class. 
- Decorator design pattern uses abstract classes or interfaces with the composition to implement the wrapper.
- Decorator design patterns create decorator classes, which wrap the original class and provide additional functionality by keeping the class methods' signature unchanged.
- Decorator Pattern provides an alternative to subclassing for extending behavior.
 
### Explanation for our example:
We are having Beverage as abstract class Component ( could be interface ) and different implementations of it.
We have also object (Decorator) that could extend the functionality, or the behavior of the Component (Beverage).
So for the sake of simplicity, we can decorate Beverage with Ice or Mocha... or whatever you want.

### Procedure
1. We have our Beverage object.
2. We want to **decorate** it manually, and to add something that is not fixed in the standard Beverage.
3. We **wrap** the Beverage into Decorator:  newBev = new Decorator(bev) => we have new DecoratedBeverage.
4. You can Decorate the newBev once again multiple times until you have your thing done.

### Hints
1. There is a situation where you need two Mocha, and the description won't be pretty.
We can create a CondimentPrettyPrint Decorator, who will modify the description.
Or we can user map, array list in some way to save what addons to the beverage we have.

## Problem: 
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/III/assets/DecoratorTask.png)

## Decorator Concept
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/III/assets/DecoratorConcept.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/III/assets/DecoratorConceptExample.png)

## Real Life Example
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/III/assets/RealLifeExample.png)

### Links with a different kind of examples:
- https://sourcemaking.com/design_patterns/decorator
- https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm