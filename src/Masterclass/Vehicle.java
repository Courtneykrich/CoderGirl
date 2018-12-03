package Masterclass;
// inheritance challenge
public class Vehicle{
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle() {
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer (int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at "+ currentDirection + " degrees");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move(int velocity, int direction){
    currentVelocity = velocity;
    currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in direction "+currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
    }

    public static void main(String[]args){
        Pacifica badAssMomVan = new Pacifica(36);
        badAssMomVan.steer(45);
        badAssMomVan.accelerate(30);
        badAssMomVan.accelerate(20);
        badAssMomVan.accelerate(-42);
    }




}
