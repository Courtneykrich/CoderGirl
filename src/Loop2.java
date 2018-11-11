import java.util.Scanner;
public class Loop2 {
    static Scanner keyboard = new Scanner(System.in);
    int pound = 0;

    public static void HowWide(int pounds) {
        do {
            System.out.println();
            System.out.println("Number?");
            pounds = keyboard.nextInt();

            for (int counter = 0; counter < pounds; counter++) {
                System.out.print("#");
            }
        } while (pounds != 0);
    }

    public static void main(String[] args) {


        System.out.println("Welcome to Bar Chart");
        System.out.println();
        HowWide(0);
        System.out.println("Have a wonderful day!");


    }
}
