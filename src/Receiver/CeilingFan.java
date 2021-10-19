package Receiver;

public class CeilingFan {
    public final static int HIGH = 3;
    public final static int MEDIUM = 2;
    public final static int LOW = 1;
    public final static int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.println("CeilingFan speed " + location + " high");
        speed = HIGH;
    }

    public void medium() {
        System.out.println("CeilingFan speed " + location + " medium");
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("CeilingFan speed " + location + " low");
        speed = LOW;
    }

    public void off() {
        System.out.println("CeilingFan in " + location + " is off");
        this.speed = OFF;
    }

    public int getSpeed() {
        return this.speed;
    }
}
