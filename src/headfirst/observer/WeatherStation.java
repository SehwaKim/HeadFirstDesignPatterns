package headfirst.observer;

import headfirst.observer.display.impl.CurrentConditionDisplay;
import headfirst.observer.display.impl.ForecastDisplay;
import headfirst.observer.display.impl.StatisticsDisplay;
import headfirst.observer.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 79, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
