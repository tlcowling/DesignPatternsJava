package Command;

public class GarageDoor {
    private String identity;

    public GarageDoor() {}
    public GarageDoor(String identity) {

        this.identity = identity;
    }

    public void open(){
        System.out.println("opening garagedoor");
    }

    public void close() {
        System.out.println("Closing garagedoor");
    }
}
