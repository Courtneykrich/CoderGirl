public class Modem {
    private int speed;
    public void displaySpeed(){
        System.out.println("Speed: "+ getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
