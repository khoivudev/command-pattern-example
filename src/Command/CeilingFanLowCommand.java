package Command;

import Receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {
    
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
       super(ceilingFan);
    }

    public void execute() {
        super.execute();
        ceilingFan.low();
    }
}
