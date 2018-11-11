import java.util.*;
public class Loop1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int limit;
        System.out.println("How big of a number should I count?");
        limit = keyboard.nextInt();
        for (int counter = 1; counter <= limit; counter++) {
            System.out.print(counter + " ");
        }
        System.out.println();
        for (int counter = limit; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
    }
}
