package Receiver;

public class Stereo {
    boolean onOffStatus = false;
    int volume;
    String location;
    
    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo in " + location + " is on");
        this.onOffStatus = true;
    }

    public void off() {
        System.out.println("Stereo in " + location + " is off");
        this.onOffStatus = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCD() {
        return;
    }

}
