package EarlyWeeks;

import static java.lang.System.out;
import java.util.Scanner;
public class AreWeThereYet

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String arewethere = "";
        boolean keepgoing = true;

        while (keepgoing)
        {
            out.println("Are we there yet?");
            arewethere = keyboard.nextLine();
            {
                if (arewethere.equals("yes"))
                {
                    keepgoing = false;
                    out.println("Yay!");
                }
                else if (!arewethere.equals("no"))
                    {
                        out.println("HUH? I don't understand");
                    }

                }


                }

            }


        }





