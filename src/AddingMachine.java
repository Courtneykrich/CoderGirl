import static java.lang.System.out;
import java.util.Scanner;
public class AddingMachine
{

    public static void main(String[] args)
    {
        out.println();
        out.println("Welcome to Adding Machine!");
        int total = 0;
        out.println("Total:" + total);
        out.println();
        out.println("Add:");
        Scanner keyboard = new Scanner(System.in);
        int add = keyboard.nextInt();
        int cnt=0,i;


        do
            {
                total = total + add;
            out.println("Total:"+ total);

            out.println("Add:");
            add = keyboard.nextInt();
                cnt+=1;

            }
        while (add != 0);
        {


        }
        out.println("You entered " + cnt+ " numbers " + "with a ending total of " + total );
    }
}