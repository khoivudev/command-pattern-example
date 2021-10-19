package Command;

import Receiver.Light;

public class LightOffCommand implements Command {
    Light light;
    boolean prevStatus;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevStatus = light.getStatus();
        light.off();
    }

    public void undo() {
        if (prevStatus) {
            light.on();
        } else {
            light.off();
        }
    }
}
