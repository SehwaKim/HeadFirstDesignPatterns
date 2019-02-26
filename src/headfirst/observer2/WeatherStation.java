package headfirst.observer2;

import headfirst.observer2.display.impl.CurrentConditionDisplay;
import headfirst.observer2.display.impl.ForecastDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 79, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
