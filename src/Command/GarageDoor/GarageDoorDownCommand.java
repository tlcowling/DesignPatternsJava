package Command.GarageDoor;

import Command.Command;

public class GarageDoorDownCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.close();
    }

    @Override
    public void undo() {
        this.garageDoor.open();
    }
}
