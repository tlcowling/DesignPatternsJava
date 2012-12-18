package Observer.Displays;

import Observer.Observer.Observer;

public class ThirdPartyDisplay implements Observer, Display {

    @Override
    public void display() {
        System.out.println("Updating Third party dispaly");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Updating third party update");
    }
}
