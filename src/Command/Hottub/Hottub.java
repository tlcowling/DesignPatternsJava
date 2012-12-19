package Command.Hottub;

public class Hottub {
    private String location;
    public static final int OFF = 0;
    public static final int ON = 1;
    public int currentState;

    public Hottub() {}
    public Hottub(String location) {
        this.location = location;
    }

    private void setHottub(int state) {
        this.currentState = state;
    }

    public void on() {
        this.setHottub(Hottub.ON);
    }

    public void off() {
        this.setHottub(Hottub.OFF);
    }
}
