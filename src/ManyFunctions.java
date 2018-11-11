import static java.lang.System.out;

public class ManyFunctions
{
    public static int minimum(int input1, int input2) {
        if (input1 > input2) {
            return input2;
        } else {
            return input1;
        }
    }

    public static int maximum(int input1, int input2) {
        if (input1 > input2) {
            return input1;
        } else
            return input2;
    }

    public static boolean isOddNumber(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowel(char letter)
    {
        return "aeiouAEIOU".indexOf(letter)!=-1;
    }

    public static boolean isConsonant(char letter)
    {
        return "aeiouAEIOU".indexOf(letter)==-1;
    }

    public static void main(String[] args) {
        out.println();
        out.print("Testing your functions.\n");
        int testFailures = 0;

        if (minimum(4, 3) != 3) {
            out.println("Error 1: Minimum failed test.  Expected 3, got " + minimum(4, 3));
            testFailures++;
        }
        if (minimum(4, 4) != 4) {
            out.println("Error 2: Minimum failed test.  Expected 4, got " + minimum(4, 4));
            testFailures++;
        }
        if (minimum(3, 4) != 3) {
            out.println("Error 3: Minimum failed test.  Expected 3, got " + minimum(3, 4));
            testFailures++;
        }
        if (minimum(5, 4) != 4) {
            out.println("Error 4: Minimum failed test.  Expected 4, got " + minimum(5, 4));
            testFailures++;
        }

        if (maximum(4, 3) != 4) {
            out.println("Error 5: Maxmimum failed test.  Expected 4, got " + maximum(4, 3));
            testFailures++;
        }
        if (maximum(3, 4) != 4) {
            out.println("Error 6: Maxmimum failed test.  Expected 4, got " + maximum(3, 4));
            testFailures++;
        }
        if (maximum(4, 4) != 4) {
            out.println("Error 7: Maxmimum failed test.  Expected 4, got " + maximum(4, 4));
            testFailures++;
        }

        if (maximum(-2, 10) != 10) {
            out.println("Error 8: Maxmimum failed test.  Expected 10, got " + maximum(-2, 10));
            testFailures++;
        }
        if (isEvenNumber(3)) {
            out.print("Error 9: isEven failed test.  Expected isEven(3) to be false, but got true.");
            testFailures++;
        }
        if (!isEvenNumber(2)) {
            out.print("Error 10: isEven failed test.  Expected isEven(2) to be true, but got false.");
            testFailures++;
        }
        if (isOddNumber(0)) {
            out.print("Error 11: isOdd failed test.  Expected isOdd(0) to be false, but got true.");
            testFailures++;
        }
        if (!isOddNumber(5)) {
            out.print("Error 12: isOdd failed test.  Expected isOdd(5) to be true, but got false.");
            testFailures++;
        }
        if (isOddNumber(18)) {
            out.print("Error 13: isOdd failed test.  Expected isOdd(18) to be false, but got true.");
            testFailures++;
        }

        if (!isVowel('a')) {
            out.print("Error 14: isVowel failed test.  Expected isVowel('a') to be true, but got false.");
            testFailures++;
        }
        if (isVowel('x')) {
            out.print("Error 15: isVowel failed test.  Expected isVowel('x') to be false, but got true.");
            testFailures++;
        }
        if (!isConsonant('z')) {
            out.print("Error 16: isConsonant failed test.  Expected isConsonant('z') to be true, but got false.");
            testFailures++;
        }
        if (isConsonant('i')) {
            out.print("Error 17: isCononant failed test.  Expect isConsonant('i') to be false, but got true.");
            testFailures++;
        }
        if (!isConsonant('b')) {
            out.print("Error 18: isConsonant failed test.  Expected isConsonant('b') to be true, but got false.");
            testFailures++;
        }
        if (!isConsonant('c')) {
            out.print("Error 19: isConsonant failed test.  Expected isConsonant('c') to be true, but got false.");
            testFailures++;
        }
        if (!isConsonant('d')) {
            out.print("Error 20: isConsonant failed test.  Expected isConsonant('d') to be true, but got false.");
            testFailures++;
        }
        if (!isConsonant('f')) {
            out.print("Error 21: isConsonant failed test.  Expected isConsonant('f') to be true, but got false.");
            testFailures++;
        }
        if (!isConsonant('g')) {
            out.print("Error 22: isConsonant failed test.  Expected isConsonant('g') to be true, but got false.");
            testFailures++;
        }
        if (!isVowel('A')) {
            out.print("Error 23: isVowel failed test.  Expected isVowel('A') to be true, but got false.");
            testFailures++;
        }
        if (isVowel('X')) {
            out.print("Error 24: isVowel failed test.  Expected isVowel('X') to be false, but got true.");
            testFailures++;
        }
        if (!isConsonant('Z')) {
            System.out.print("Error 25: isConsonant failed test.  Expected isConsonant('Z') to be true, but got false.");
        }
        if (isConsonant('I')) {
            out.print("Error 26: isCononant failed test.  Expect isConsonant('I') to be false, but got true.");
            testFailures++;
        }

        if (testFailures == 0) {
            out.print("Success!  All test cases passed.");
        } else {
            out.print(testFailures + " tests failed.  Keep trying!");
        }

    }
}
