package RemoteControl;

import Command.*;
import java.util.*;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands = new Stack<>();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i< 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void undoButtonWasPushed() {
        try {
            Command undoCommand = undoCommands.pop();
            undoCommand.undo();
        } catch(EmptyStackException e) {
            System.out.println("No command to undo");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------Remote Control------\n");
        for(int i = 0; i< 7; i++) {
            stringBuffer.append("[slot " + i + "] " 
                                + onCommands[i].getClass().getName() + "\t\t" 
                                + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
