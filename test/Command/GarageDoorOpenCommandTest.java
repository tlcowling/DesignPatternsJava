package Command;

import org.junit.Test;

public class GarageDoorOpenCommandTest {
    @Test
    public void testGarageDoorOpens() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
