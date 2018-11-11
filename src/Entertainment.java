import static java.lang.System.out;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weather;
        String mood;
        String result;
        String sunny;
        String rainy;
        String cloudy;
        String tired;
        String relaxed;
        String excited;
        out.println();
        out.println("What is the weather like today? Answer sunny, rainy, or cloudy.");
        weather = keyboard.next();
        out.println("How are you feeling today? Answer tired, relaxed, or excited.");
        mood=keyboard.next();
        if ((weather.equals("sunny")) && (mood.equals("tired")))
        {
            out.println("Maybe a short walk will wake you up a bit.");
        }
        else if (weather.equals("cloudy")&&(mood.equals("tired")))
        {
            out.println("It sounds like today might be a good day to read your favorite book on the back porch.");
        }
        else if (weather.equals("rainy")&& (mood.equals("tired")))
        {
            out.println("Today seems like a good day to take a nap.");
        }
        else if (weather.equals("sunny")&& (mood.equals("relaxed")))
        {
            out.println("It might be fun to check out a local festival today.");
        }
        else if (weather.equals("rainy")&& mood.equals("relaxed"))
        {
            out.println("The Art Museum could be fun today");
        }
        else if (weather.equals("cloudy")&&mood.equals("relaxed"))
        {
            out.println("A walk through the botanical gardens would be nice.");
        }
        else if (weather.equals("sunny")&& mood.equals("excited")) {
            out.println("What about a pool day?");
        }
        else if (weather.equals("rainy")&& mood.equals("excited"))
        {
            out.println("Leaping lizards trampoline park is fun idea.");
        }
        else if (weather.equals("cloudy")&& mood.equals("excited"))
        {
                out.println("It seems like a good day for a family bike ride.");
        }
        else
        {
            if (mood.equals("tired")|| mood.equals("relaxed")|| mood.equals("excited"))
            {
                out.println("ERROR: your weather choice is not a valid option");
            }
            if (weather.equals("sunny") || weather.equals("rainy") || weather.equals("cloudy"))
            {
                out.println("ERROR: your mood is not a valid option");
            }


            }
        }

    }

