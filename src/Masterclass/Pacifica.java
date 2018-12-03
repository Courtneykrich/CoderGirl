package Masterclass;

public class Pacifica extends Car {
    private int roadServiceMonths;

    public Pacifica(int roadServiceMonths) {
        super("Pacifica", "Minivan", 4, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity =getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else  if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <= 25){
            changeGear(2);
        }else if (newVelocity > 25 && newVelocity <= 40){
            changeGear(3);
        }else {
            changeGear(4);
        }if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }



    }


}
