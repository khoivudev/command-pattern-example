package Receiver;

public class CeilingFan {
    boolean status = false;
    String location;
    
    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("CeilingFan in " + location + " is on");
        this.status = true;
    }

    public void off() {
        System.out.println("CeilingFan in " + location + " is off");
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }
}
