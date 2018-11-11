public class Cat {

    // has a:
    //name String
    //fur int
    //tail boolean
    //ears String
    //lives int
    //birthday Date
    private String name;
    private int fur;
    private int lives;


    public Cat(String name, int fur) {
        this.lives = 9;
        this.name = name;
        this.fur = fur;

    }

    public void meow() {
        System.out.println(this.name + " says MEOW!");
    }

    public boolean shed(int quantity) {
        if (quantity < this.fur){
            this.fur = this.fur -quantity;
    }else {
            this.fur = 0;
        }
        return true;
    }
    public int getFur(){
        return this.fur;
    }

public static void main(String[]args){
        Cat franklin = new Cat("Franklin", 10000000);
        franklin.meow();
        Cat sally = new Cat("Sally", 10000000);
        sally.meow();
        sally.shed(10000);
        System.out.println(sally.getFur());
}

    //can (do)
    //boolean hunt(String prey)
    //void meow()
    //play(String toy)
    //eat(String food)
    //sleep(int minutes)
    //shed(int quantity)
}
