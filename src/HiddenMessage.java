public class HiddenMessage {
    public static void main(String[] args) {
        System.out.println("Hidden Message");

        String binary = "1110010";
        int decimalValue = Integer.parseInt(binary, 2);
        System.out.println(decimalValue);

        int nums[] = {decimalValue};

        for (int index = 0; index < nums.length; index++) {
            char letter = (char) nums[index];
            System.out.print(letter);


        }

    }

}



