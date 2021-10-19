package Command;

import Receiver.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanCommand {
    
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
       super(ceilingFan);
    }

    public void execute() {
        super.execute();
        ceilingFan.medium();
    }
}
