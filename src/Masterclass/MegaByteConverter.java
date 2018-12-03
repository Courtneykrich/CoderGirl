package Masterclass;

public class MegaByteConverter {

        public static void printMegaBytesAndKiloBytes(int kiloByte) {
            int megaByte;
            int remainder;
            if (kiloByte < 0) {
                System.out.println("Invalid Value");
            } else {
                megaByte = kiloByte / 1024;
                remainder = kiloByte % 1024;
                System.out.println(kiloByte + " KB = " + megaByte + " MB and " + remainder + " KB");
            }
        }
        public static void main(String[]args){
            printMegaBytesAndKiloBytes(12589);
         }



}
