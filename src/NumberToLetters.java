import java.util.*;

public class NumberToLetters {
    public static void main(String[] args)
    {
        int nums[] = { 89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33 };

        for (int index = 0; index < nums.length; index++)
        {
            char letter = (char) nums[index];
            System.out.print(letter);


        }
        System.out.println();
        String message = "Crow flies at dawn.";
        int messageLength = message.length();

        for (int i = 0; i < messageLength; i++) {
            char character = message.charAt(i);
            int ascii = (int) character;
            System.out.print(ascii+", ");
        }



    }

}
