package Masterclass;
// inheritance challenge
public class Vehicle{
    int speed;
    int gear;
    boolean isTurning = false;

    public Vehicle() {
    }

    public Vehicle(int speed, int gear, boolean isTurning){
        this.speed = speed;
        this.gear = gear;
        this.isTurning = isTurning;
    }



    public boolean steering(boolean isTurning){

        return isTurning;
    }

    public void changeGears(int gear){
        if (speed < 10){
            gear = 1;
        }
        else if (speed > 10 && speed < 30){
            gear = 2;
        }
        else if (speed > 30 && speed < 60){
            gear = 3;
        }
        switch (gear = 4) {
        }
        System.out.println("Car is in " + gear);

    }

    public void moveVehicle(int speed){

    }
}
