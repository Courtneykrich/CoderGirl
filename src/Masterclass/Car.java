package Masterclass;

public class Car extends Vehicle {
    int wheels;
    String color;

    public Car(int speed, int gear, boolean isTurning, int wheels, String color) {
        super(speed, gear, isTurning);
        this.wheels = wheels;
        this.color = color;
    }
}
