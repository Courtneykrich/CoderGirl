public class Rectangle {
    private double length;
    private double wideth;

    public Rectangle(double length, double width) {
        this.length = length;
        this.wideth = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;

        }
    }

    public double computeArea (){
        return this.length * this.wideth;
    }

    public boolean isBiggerThan (Rectangle other){
        return this.computeArea()> other.computeArea();
    }
    public boolean isBiggerThan(Circle other){
        return this.computeArea()> other.computeArea();
    }

    public static void main(String[]args){
        Rectangle rl = new Rectangle(2,4);
        rl.computeArea();
        System.out.println(rl.computeArea());
        Rectangle r2 = new Rectangle(3,5);
        System.out.println(r2.computeArea());
        System.out.println(rl.isBiggerThan(r2));
        System.out.println(r2.isBiggerThan(rl));

        Circle c = new Circle(2);
        rl.isBiggerThan(c);
        System.out.println(rl.isBiggerThan(c));
        c.isBiggerThan(rl);
        System.out.println(c.isBiggerThan(rl));


    }
}
