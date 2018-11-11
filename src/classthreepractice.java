import java.util.Scanner;

public class classthreepractice
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("type the first value:");
        int first = keyboard.nextInt();
        System.out.println("type in the second value");
        int second = keyboard.nextInt();

        if (first > second)
        {
            System.out.println(first);
            System.out.println(second);
        }
        else if (second > first)
        {
            System.out.println(second);
            System.out.println(first);
        }
        else
        {
            System.out.println("they are equal");
        }
    }
}
