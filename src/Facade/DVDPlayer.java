package Facade;

public class DVDPlayer {
    public void stop() {
        System.out.println("The DVD player stops.");
    }

    public void eject() {
        System.out.println("The DVD player gets ejected");
    }

    public void off() {
        System.out.println("The DVD Player gets turned off");
    }

    public String toString(){
        return "DVD Player Giblets";
    }

    public void on() {
        System.out.println("DVD Player goes on");
    }

    public void play(String movie) {
        System.out.println("DVD Player choosing movie " + movie);
        System.out.println("Playing movie...");
    }
}
