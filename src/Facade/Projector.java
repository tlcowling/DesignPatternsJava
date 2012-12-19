package Facade;

public class Projector {
    public static final int DEFAULT_MODE = 0;
    public static final int WIDESCREEN_MODE = 1;

    private int mode = Projector.DEFAULT_MODE;

    public void off() {
        System.out.println("The projector goes off");
    }

    public void on() {
        System.out.println("Projector goes on");
    }

    public void wideScreenMode() {
        System.out.println("Setting widescreen mode");
        System.out.println("Current mode is " + this.mode);
    }
}
