package Receiver;

public class Light {
    boolean status = false;

    public Light() {}

    public void on() {
        this.status = true;
    }

    public void off() {
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }
}
