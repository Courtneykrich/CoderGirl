public class NumberArrays {

public static void  main(String[]args) {
    int highTemps1[] = {84, 81, 77, 79, 73, 93, 92};
    int highTemps2[] = {93, 95, 82, 79, 88, 91, 90};
    String dayOfWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int sum = 0;


    for (int index = 0; index < highTemps1.length; index++) {
        sum += highTemps1[index];
    }
    float average = sum / (float) highTemps1.length;
    System.out.println("The average daily-high temperature last week was " + average + " degress.");
    int weeklyHigh = highTemps1[0];
    for (int index = 1; index < dayOfWeek.length; index++) {
        if (highTemps1[index] > weeklyHigh) {
            weeklyHigh = highTemps1[index];
            System.out.print("Last week,  " + dayOfWeek[index] + " was the warmest day ");
            System.out.println("at " + weeklyHigh + " degress.");
        }


    }
    sum=0;
    for (int index = 0; index < highTemps2.length; index++) {
        sum += highTemps2[index];
    }
    average = sum / (float) highTemps2.length;
    System.out.println("The average daily-high temperature this week is " + average + " degress.");
    weeklyHigh = highTemps2[0];
    for (int index = 1; index < dayOfWeek.length; index++) {
        if (highTemps2[index] > weeklyHigh) {
            weeklyHigh = highTemps2[index];
            System.out.print("This week,  " + dayOfWeek[index] + " was the warmest day ");
            System.out.println("at " + weeklyHigh + " degress.");
        }


    }

}
}
