package Masterclass;

public class FloatAndDouble {
    public static void main(String[]args){
       // width of int is 32 (4 bytes)
        int myIntValue= 5/3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue=5d/3d;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);

        double  pounds = 200d;
        double kilograms = pounds*.45359237;
        System.out.println(pounds+ " lbs = "+kilograms+" kg");


    }
}
