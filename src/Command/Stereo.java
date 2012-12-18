package Command;

public class Stereo {
    private int volume;
    private boolean cd;
    private String identity;

    public Stereo(String identity) {
        //To change body of created methods use File | Settings | File Templates.
        this.identity = identity;
    }

    public void on() {
        System.out.println("Stero On");
    }

    public void setVolume(int i) {
        this.volume = i;
    }

    public void setCD() {
        this.cd = true;
    }

    public void off() {
        System.out.println("Stereo is going off");
    }
}
