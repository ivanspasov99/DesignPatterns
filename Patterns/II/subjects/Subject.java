package II.subjects;

import II.observers.Observer;

public interface Subject {
    // Observer

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
