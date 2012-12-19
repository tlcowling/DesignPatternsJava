package Command.GarageDoor;

import Command.Command;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.open();
    }

    @Override
    public void undo() {
        this.garageDoor.close();
    }
}
