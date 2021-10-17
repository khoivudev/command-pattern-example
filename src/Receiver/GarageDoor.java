package Receiver;

public class GarageDoor {
    public static final int CLOSE_POSITION = 0;
    public static final int OPEN_POSITION = 10;
    int position = CLOSE_POSITION;
    boolean lightStatus = false;

    public GarageDoor() {}

    public void up() {
        if (position == 10) {
            System.out.println("Door open max");
        } else {
            position++;
        }
    }

    public void down() {
        if (position == 0) {
            System.out.println("Door close max");
        } else {
            position--;
        }
    }

    public void open() {
        System.out.println("GarageDoor is open");
        this.position = OPEN_POSITION;
    }

    public void close() {
        System.out.println("GarageDoor is close");
        this.position = CLOSE_POSITION;
    }

    public void lightOn() {
        lightStatus = true;
    }

    public void lightOff() {
        lightStatus = false;
    }

    public int getPosition() {
        return position;
    }

    public boolean getLightStatus() {
        return lightStatus;
    }

    public String getStatus() {
       return "Door position: " + position + " Light Status: " + lightStatus;
    }
}
