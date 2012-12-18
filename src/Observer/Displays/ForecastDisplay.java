package Observer.Displays;

import Observer.Observer.Observer;

public class ForecastDisplay implements Observer, Display {


    @Override
    public void display() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast display updated");
    }
}
