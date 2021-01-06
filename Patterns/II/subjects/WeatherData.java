package II.subjects;

import II.observers.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    private void setMeasurements(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        // register new
    }

    @Override
    public void removeObserver(Observer o) {
        // remove if needed
    }

    @Override
    public void notifyObservers() {
        // iterate over all and update every one of them
    }

    // getters
    // setters - if we need them
}
