package VI.commands;

import VI.receiver.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // could be more than one method
        // maybe chain of methods
        // depends on what sub command
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
