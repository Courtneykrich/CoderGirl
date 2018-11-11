public class ASCIIchart {
    public static void main(String[]args){
        int num;

        System.out.println(" The ASCII Chart ");
        System.out.println();

            for(num = 32; num <= 255; num++)
            {
                System.out.println(num + " = "+ (char)num);
            }

    }
}
