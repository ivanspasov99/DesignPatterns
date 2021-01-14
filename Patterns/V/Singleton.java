package V;

public class Singleton {
    // volatile - check direct in main memory for the value not in the cache
    // slower but safer when multiple threads are accessing variable
    private volatile static Singleton singleton  = new Singleton();

    // it needs to be declared private because we do not want to have the possibility to instatiate it
    private Singleton() { }

    // only this method will be visible for getting the object
    public static Singleton getInstance() {
        return singleton;
    }

    // other methods
}
