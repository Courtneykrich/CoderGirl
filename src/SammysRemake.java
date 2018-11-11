import static java.lang.System.out;
import java.util.Scanner;

public class SammysRemake
{
    public static void  main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int veg;
        int burger;
        int sub;
        int soup;
        out.println("Checking Sales Goals");
        out.println();
        out.println("The sales goal for veggie sandwiches is "+ goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        veg=keyboard.nextInt();
        if (veg>=goalForVeggies)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for burgers is "+ goalForBurgers);
        out.println("How many burger were sold today?");
        burger=keyboard.nextInt();
        if (burger>=goalForBurgers)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for subs is "+goalForSubs);
        out.println("How many subs were sold today?");
        sub=keyboard.nextInt();
        if (sub>= goalForSubs)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        out.println("The sales goal for soup is "+goalForSoup);
        soup=keyboard.nextInt();
        if (soup>=goalForSoup)
        {
            out.println("Made goal!");
        }
        else
            out.println("Fell short.");
        out.println();
        if ((veg >= goalForVeggies) && (burger >= goalForBurgers) && (sub >= goalForSubs) && (soup >= goalForSoup))
        {
            out.println("Made goals for everything today!");
        }
        else
            out.println("Fell Short of all goals.");

    }
}
