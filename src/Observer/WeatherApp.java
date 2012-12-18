package Observer;

import Observer.Displays.CurrentConditionsDisplay;
import Observer.Displays.ForecastDisplay;
import Observer.Displays.StatisticsDisplay;
import Observer.Subject.WeatherData;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 65, 29.2f);
        weatherData.setMeasurements(83, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.4f);



    }
}
