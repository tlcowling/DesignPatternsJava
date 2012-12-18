package Observer.Displays;

import Observer.Observer.Observer;

public class StatisticsDisplay implements Observer, Display {

    @Override
    public void display() {
        System.out.println("Statistics Display");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
