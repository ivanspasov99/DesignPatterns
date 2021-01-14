## Factory Method Pattern - Abstract Factory
**Creational Pattern**

> look at the pictures first

> Design could be different, but the idea is clear

### Factory Method Idea:
1. The Factory method handles **object creation** and encapsulates it in abstract method
that is implemented by a class. This decouples the client code in the superclass from the object creation code
in the subclass.
2. In class-based programming, the factory method pattern is a creational pattern that 
uses factory methods to deal with the problem of **creating objects without having to 
specify the exact class** of the object that will be created.
3. Applies **The Dependency Inversion Principle**. Depend upon abstractions not concrete classes.
In our case we do not depend on Different Kind Of Pizza ( creation of pizza, where it comes from, how it is made, with what ingredients)
but depend only on Pizza Interface. Out Pizza Store depends on Pizza abstraction in order function, and 
has connection with what type of Pizza store it is (Sofia or Varna) in the abstract method.

### Abstract Factory idea:
1. The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.


### Abstract Factory:
> What happens when we have multiple objects that differs and in different regions are implemented differently

1. We create Abstract Factory that holds all abstract creational methods that needs implementation
2. Ingredients are the object that our Factories will produce. They are user in Pizza, so we need
abstract factory method in Pizza, to set the ingredients to the specific pizza.
3. Factories need to be set also in the Pizza Stores...


## Problem: 
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/FactoryTaskv1.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/FactoryTaskv2.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/FactoryTaskv3.png)

## Factory Method Concept
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/FactoryConceptv1.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/FactoryConceptv2.png)

## Dependency Inversion Principle
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/DIPv1.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/DIPv2.png)

## Abstract Factory
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/IV/assets/AbstractFactoryv1.png)