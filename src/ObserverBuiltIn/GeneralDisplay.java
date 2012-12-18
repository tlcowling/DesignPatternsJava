package ObserverBuiltIn;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer{
    private Observable weatherData;
    private float temperature;
    private float humidity;

    public GeneralDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    private void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
