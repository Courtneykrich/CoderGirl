package Masterclass;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean inManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean inManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.inManual = inManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): change to "+this.currentGear+" gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): velocity "+speed+" direction "+direction);
        move(speed, direction);

    }

}
