package Command;

import Receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {
    
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
       super(ceilingFan);
    }

    public void execute() {
        super.execute();
        ceilingFan.high();
    }
}
