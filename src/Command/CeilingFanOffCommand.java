package Command;

import Receiver.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {
    
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
       super(ceilingFan);
    }

    public void execute() {
        super.execute();
        ceilingFan.off();
    }
}
