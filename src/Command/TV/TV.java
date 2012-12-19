package Command.TV;

public class TV {
    private String location;
    private int tvState;
    public static final int OFF = 0;
    public static final int ON = 1;

    public TV() {}
    public TV(String location) {
        this.location = location;
    }

    public void on() {
        this.tvState = TV.ON;
    }

    public void off() {
        this.tvState = TV.OFF;
    }
}
