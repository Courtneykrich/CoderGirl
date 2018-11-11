public class FindTheG {
    public static int findTheGs(String text){
        int count =0;
        for (int i=0; i < text.length();i++){
//            System.out.print(text.charAt(i));
            if (text.charAt(i)=='g'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[]args){
        System.out.print(findTheGs("I will giggle to the gaggle of geese."));

    }
}
