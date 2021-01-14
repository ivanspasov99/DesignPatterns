## Command Pattern
Encapsulating method invocation

### Command Pattern Ideas:
1. **The Command Pattern allows you to decouple the requester of an action from the object that actually performs
the action. So, here the requester would be the remote control, and the object that performs the action would 
be an instance of one of your vendor classes.**
2. **Command Pattern introduces command objects. Command Object encapsulates a request 
to do something (turn on lights) on a specific object (Living Room Lights)**. The command object will
know how to talk to the  right object to get the work done. We can introduce command object for every button (for every different home device).
3. **Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.**


### Command Pattern Problem:
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/CommandTaskv1.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/CommandTaskv2.png)

### Command Pattern Concept:
### Check 'RemoteControlTest' to understand with example the picture below:
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/CommandConceptv1.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/CommandConceptv2.png)

### Command Solution
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/CommandConceptv3.png)

### Real Life Example
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/RealLifeExample.png)
![alt text](https://github.com/ivanspasov99/DesignPatterns/blob/master/Patterns/VI/assets/RealLifeExample2.png)