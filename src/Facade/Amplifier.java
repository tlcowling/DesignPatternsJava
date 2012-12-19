package Facade;

public class Amplifier {
    private DVDPlayer dvdPlayer;
    private int volume;

    public void off() {
        System.out.println("The amplifier goes off");
    }

    public void on() {
        System.out.println("Amp goes on");
    }

    public void setDVD(DVDPlayer dvdPlayer) {
        System.out.println("setting amp for dvd player " + dvdPlayer.toString());
        this.dvdPlayer = dvdPlayer;
    }

    public void setSurroundSound() {
        System.out.println("Surround sound baby");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
