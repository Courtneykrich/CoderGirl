package EarlyWeeks;

import static java.lang.System.out;

public class Verse
{


    public static void counting(String count, String thing  )
    {

        out.print("This old man he played "+ count);
        out.println();
        out.print("He played knick-knack on my "+ thing);
        out.println();
    }
    public static void repeat()
    {
        out.print("With a knick-knack paddywack,\n");
        out.print("Give a dog a bone,\n");
        out.print("This old man can rolling home.\n");
    }

    public static void main(String[]args)
    {
        counting("one", "thumb");
        repeat();
        out.println();
        counting("two","shoe");
        repeat();
        out.println();
        counting("three","knee");
        repeat();
        out.println();
        counting("four","door");
        repeat();
        out.println();
        counting("five","hive");
        repeat();
        out.println();
        counting("six","sticks");
        repeat();
    }




}
