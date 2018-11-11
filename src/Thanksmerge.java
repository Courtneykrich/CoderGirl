import static java.lang.System.out;
import java.util.Scanner;
public class Thanksmerge {


    public static void main(String[] args) {
        out.println();
        out.println("---Thank You Letters ---");


        boolean keepGoing = true;
        Scanner keyboard = new Scanner(System.in);

        String personname = "";
        String amount = "";

        do {
            out.println("Please enter person's name");
            personname = keyboard.next();

            out.println("Donation amount");
            amount = keyboard.next();

            out.println("Dear " + personname + ",");
            out.println();
            out.print("Thank you for your donation! We rely on donors like you to keep our organization effective,\n" + "and you came through for us. Your donation of $" + amount + " will help our efforts to make a difference in the world.\n" +
                    "As you may know, we are a registered non-profit organization, so your donation is tax deductible.\n" + "You may use this letter as a receipt for tax purposes.\n");
            out.println();
            out.println("Thank you again for your support!");
            out.println();
            out.println("Sincerely,");
            out.println("Paual Jones");
            out.println("YourCharity.org");
        }
        while (!personname.equals("quit")); {

            out.println("End of notes");


            }
        }



        }



