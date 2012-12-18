package Command;

import org.junit.Test;

public class SimpleRemoteControlTest {
    @Test
    public void testButtonPressOnRemoteControl() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
