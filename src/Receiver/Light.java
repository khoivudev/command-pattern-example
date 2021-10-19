package Receiver;

public class Light {
    boolean status = false;
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light in " + location + " is on");
        this.status = true;
    }

    public void off() {
        System.out.println("Light in " + location + " is off");
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }
}
