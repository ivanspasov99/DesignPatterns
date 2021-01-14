package VI.invoker;

import VI.commands.Command;

public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        Command[] onCommands = new Command[7];
        Command[] offCommands = new Command[7];

        // init commands  or set them to new class NoCommand if you do not want to check every time
        // if command is empty

        undoCommand = null;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // does not matter which button is, left or right, it's abstract
    public void pressOnButton(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void undoButton() {
        // we do not know what is pressed but undo will done this for us
        // abstraction
        undoCommand.undo();
    }
}
