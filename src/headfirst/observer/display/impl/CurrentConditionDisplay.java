package headfirst.observer.display.impl;

import headfirst.observer.display.DisplayElement;
import headfirst.observer.Observer;
import headfirst.observer.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.format("Current conditions: %.2fF Degrees and %.2f humidity\n", temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
