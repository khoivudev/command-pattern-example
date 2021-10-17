import Client.SimpleRemoteControl;
import Command.GarageDoorOpenCommand;
import Command.*;
import Receiver.*;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        System.out.println(light.getStatus());

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        System.out.println(garageDoor.getStatus());
    }
}
