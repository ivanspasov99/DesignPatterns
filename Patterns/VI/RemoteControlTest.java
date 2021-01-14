package VI;

import VI.commands.Command;
import VI.commands.LightOffCommand;
import VI.commands.LightOnCommand;
import VI.invoker.SimpleRemoteControl;
import VI.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {

        // that is our INVOKER, we press on him buttons
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        // the light will be the RECEIVER of the request coming from the invoker
        Light light = new Light();

        // we are creating the command we want to execute
        // we are encapsulating it in Command interface, so out RemoteController does not care what the command is
        // you can see that Command is field in SimpleRemoteControl
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // what command we want to execute
        int remoteSlot = 1;
        remoteControl.setCommand(remoteSlot, lightOn, lightOff);

        // execute light on, light off
        remoteControl.pressOnButton(remoteSlot);
        remoteControl.pressOffButton(remoteSlot);

    }
}
