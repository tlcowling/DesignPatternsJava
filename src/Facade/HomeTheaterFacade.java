package Facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd, CDPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.cd = new CDPlayer();
        this.tuner = new Tuner();
        this.dvd = new DVDPlayer();
        this.projector = new Projector();
        this.lights = new TheaterLights();
        this.screen = new Screen();
        this.popper = new PopcornPopper();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch movie...." + movie);
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
}
