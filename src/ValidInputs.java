import java.util.Scanner;
public class ValidInputs {
    int firstNumber;
    int secondNumber;
    public static int getIntegerBetween(int lower, int upper){
        Scanner keyboard = new Scanner(System.in);
        int firstNumber;

        do {
            firstNumber = keyboard.nextInt();
            if (firstNumber < 1 || firstNumber > 10)
            {
                System.out.println("Error, invaild number. Try again.");
            }


        }while (firstNumber <1 || firstNumber > 10);
        return firstNumber;
    }
    public static int getTensInterger(int lower, int upper){
        Scanner keyboard = new Scanner(System.in);
        int secondNumber;
        do {
            secondNumber = keyboard.nextInt();
        while (secondNumber < 200 || secondNumber > 3000 || secondNumber %10 != 0)
            {
                System.out.println("Error, invaild number. Try again.");
                secondNumber = keyboard.nextInt();

            }

        }while (secondNumber % 10 ==0 && secondNumber < 200 && secondNumber > 3000);
            return secondNumber;

    }
    public static void main(String[] args)
    {
        System.out.println("Please enter a number from 1-10.");
        int firstNumber = getIntegerBetween(1, 10);
        System.out.println("Please enter a number between 200 and 3000 that is a multiple of ten.");
        int secondNumber = getTensInterger(200, 3000);
        System.out.println("You entered " + firstNumber + " and " +
                secondNumber);


    }
}