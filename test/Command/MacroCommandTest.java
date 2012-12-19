package Command;

import Command.Hottub.Hottub;
import Command.Hottub.HottubOffCommand;
import Command.Hottub.HottubOnCommand;
import Command.Lights.Light;
import Command.Lights.LightOffCommand;
import Command.Lights.LightOnCommand;
import Command.Stereo.Stereo;
import Command.Stereo.StereoOffCommand;
import Command.Stereo.StereoOnCommand;
import Command.TV.TV;
import Command.TV.TVOffCommand;
import Command.TV.TVOnCommand;
import org.junit.Test;

public class MacroCommandTest {

    @Test
    public void testLightStereoTVHotTubCommand() {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl testRemote = new RemoteControl();

        testRemote.setCommand(0, partyOnMacro, partyOffMacro);
        testRemote.onButtonWasPushed(0);
        testRemote.offButtonWasPushed(0);
    }
}
