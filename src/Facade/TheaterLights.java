package Facade;

public class TheaterLights {
    private int dimness;

    public void on() {
        System.out.println("Put the theater lights on");
    }

    public void dim(int i) {
        this.dimness = i;
        System.out.println("Lights dimmed to " + this.dimness);
    }
}
