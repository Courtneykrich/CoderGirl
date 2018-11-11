package EarlyWeeks;

import static java.lang.System.out;
import java.util.Scanner;
public class CountTen
{
    public static String getEnglishword(int number)
    {
        //zero one two three four five six seven eight nine ten
        if (number == 0)
        {return "zero";}
        else if (number ==1)
        {return "one";}
        else if (number == 2)
        {return "two";}
        else if (number == 3)
        {return "three";}
        else if (number == 4)
        {return "four";}
        else if (number ==5)
        {return "five";}
        else if (number == 6)
        {return "six";}
        else if (number == 7)
        {return "seven";}
        else if (number == 8)
        {return "eight";}
        else if (number == 9)
        {return "nine";}
        return "ten";
    }
    public static String getSpanishword (int number)
    {
        //cero uno dos tres cuatro cinco seis siete ocho nueve diez
        if (number == 0)
        {return "cero";}
        else if(number == 1)
        {return "uno";}
        else if (number ==2)
        {return "dos";}
        else if (number==3)
        {return "tres";}
        else if (number == 4)
        {return "cuatro";}
        else if (number == 5)
        {return "cinco";}
        else if (number == 6)
        {return "seis";}
        else if (number ==7)
        {return "siete";}
        else if (number == 8)
        {return "ocho";}
        else if (number == 9)
        {return "nueve";}
        return "diez";

    }
    public static String getGermanword(int number)
    {
        if (number == 0)
        {return "null";}
        else if(number == 1)
        {return "eins";}
        else if (number ==2)
        {return "zwei";}
        else if (number==3)
        {return "drei";}
        else if (number == 4)
        {return "vier";}
        else if (number == 5)
        {return "funf";}
        else if (number == 6)
        {return "sechs";}
        else if (number ==7)
        {return "sieben";}
        else if (number == 8)
        {return "acht";}
        else if (number == 9)
        {return "neun";}
        return "zehn";
    }
    public static String getWOrd (String language, int number)
    {
        if (number < 0)
        {return "Number too small.";}
        if (number> 10)
        {return "Number to large.";}
        if ("e".equals(language))
        {return getEnglishword(number);}
        else if ("s".equals(language))
        {return getSpanishword(number);}
        else if ("g".equals(language))
        {return getGermanword(number);}
        return "unrecognized language choice.";
    }
    public static void main(String[]args)
    {
        System.out.println();
        System.out.print("Would you like Spanish, German or English?\n");
        System.out.print("Press S, G or E\n");
        Scanner keyboard = new Scanner(System.in);
        String language = keyboard.nextLine();

        System.out.print("What number do you want the name of? 0-10");
        int number = keyboard.nextInt();
        keyboard.skip("\n");

        String spelled_out = getWOrd(language, number);
        System.out.println("The word for " + number + " is " + spelled_out);



    }

}

