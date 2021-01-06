#### Observer Pattern
**Behavioral Pattern**


> look at the pictures first

> ... defines a one-to-many dependency between objects so that when one object changes state,
> all of its dependents are notified and updated automatically

#### Use when:
- When the dependencies have one sender has many recipients. Real life example is subscription
 systems, you subscribe to subject, he updates you with information.
- Communication Pattern 

- Observer pattern provides loosely coupled design
    - Subject knows only about Observer Interface. 
    It does not know the concrete class of the observer and his behavior.
    - We can add new Observers/Subjects at any time
    - We can modify/extend both without affecting each other
    - We can reuse them independent

###### Problem: 
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/II/assets/ObserverTask.png)

###### Observer Concept
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/II/assets/ObserverConcept.png)

