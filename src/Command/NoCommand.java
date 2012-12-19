package Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("An implementation of a null object.");
    }

    @Override
    public void undo() {
        System.out.println("No action to undo");
    }
}
