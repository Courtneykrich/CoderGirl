import static java.lang.System.out;
import java.util.Scanner;
public class reentertainment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weather = new String();

        String mood = new String();


        out.println();
        out.println("what is the weather like today? Answer sunny, rainy, or cloudy.");
        weather = keyboard.next();
        boolean sun = (weather.equals("sunny"));
        boolean rain = (weather.equals("rainy"));
        boolean cloud = (weather.equals("cloudy"));
        out.println("How are you feeling today?");
        mood = keyboard.next();
        boolean tired = (mood.equals("tired"));
        boolean relaxed = (mood.equals("relaxed"));
        boolean excited = (mood.equals("excited"));
        if (sun && tired) {
            out.println("Maybe a short walk will wake you up?");
        } else if (sun && relaxed) {
            out.println("Today would be a good day to check out a local farmers market.");
        } else if (sun && excited) {
            out.println("What about a pool day?");
        } else if (rain && tired) {
            out.println("Sound like a good day for a nap.");
        }
        else if (rain && relaxed)
        {
            out.println("I hear Incredibles 2 just came out.");
        } else if (rain && excited)
        {
            out.println("Leaping lizards trampoline park is open today.");
        } else if (cloud && tired)
        {
            out.println("It might be nice to read a book under a tree.");
        } else if (cloud && relaxed)
        {
            out.println("Should we grab a drink at the bar?");
        } else if (cloud && excited)
        {
            out.println("Today might a great day for a familiy bike ride.");
        } else
            {
            if (mood.equals("tired") || mood.equals("relaxed") || mood.equals("excited"))
            {
                out.println("ERROR: your weather is not a valid option");
            }
            if (weather.equals("sunny") || weather.equals("rainy") || weather.equals("cloudy"))
            {
                out.println("ERROR: your mood is not a valid option");
            }
        }
    }
}



