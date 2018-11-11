package Masterclass;

public class ByteShortInt {

    public static void main(String[] args) {

        //variables that deal with whole numbers


        // int width of 32
        int myMinValue = -2_147_483_648; //literal number vs (a*b) an expression
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMaxValue / 2);
        System.out.println("myTotal = "+myTotal);


        // byte has a width of 8
        byte myByteValue = -128; // -128 to 127
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = "+myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767; //-32768 to 32767
        short myNewShortValue = (short)(myShortValue/2);


        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        byte a = -125;
        short b = 28965;
        int c = -1_234_567_890;
        long d =(a+b+c)*10+50000;
        System.out.println(d);
    }
}
