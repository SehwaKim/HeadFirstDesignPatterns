package headfirst.observer.display.impl;

import headfirst.observer.display.DisplayElement;
import headfirst.observer.Observer;
import headfirst.observer.subject.Subject;

public class ForecastDisplay implements DisplayElement, Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.format("current pressure: %f | last pressure: %f\n", currentPressure, lastPressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
