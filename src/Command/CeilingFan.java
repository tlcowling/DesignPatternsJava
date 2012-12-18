package Command;

public class CeilingFan {
    private String id;

    public CeilingFan(String identity) {
        this.id = identity;
    }

    public void on() {
        System.out.println("Fan goes on");
    }

    public void off() {
        System.out.println("Fan goes off");
    }
}
