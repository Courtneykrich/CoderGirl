import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class MethodPractice

{
    public static void main(String[]args)
    {
        sayHi("Howard", "Harper", "Huey.");
        sayHi("Kevin, ", "Everlie, ", "and Karlyn.");
        sayHi("Ariel, ", "Flounder, ", "and Sebastian.");
        int min = findMin(2,3);
        out.println(min);
        min = findMin(5,7);
        out.println(min);
    }
    public static void sayHi(String name1, String name2, String name3)
    {
        out.println("Hello, " + name1 +", " + name2+ ", and " + name3);
    }

    public static int findMin(int value1, int value2)
    {
        if (value1<value2)
        {
            return value1;
        }
        else
            {
                return value2;
            }

    }


}
