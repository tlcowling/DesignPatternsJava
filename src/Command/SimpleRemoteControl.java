package Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() { }

    public void buttonWasPressed() {
        slot.execute();
    }

    public void setCommand(Command command) {
        slot = command;
    }
}
