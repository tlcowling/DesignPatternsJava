package Command;

public class Light {
    private String id;

    public Light() {}
    public Light(String identity) {
        this.id = identity;
    }

    public void on() {
        System.out.println("Light goes on");
    }

    public void off() {
        System.out.println("Light goes off");
    }
}
