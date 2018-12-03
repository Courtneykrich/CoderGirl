package Masterclass;

public class IfKeywordAndCodeBlocks {
    public static void main(String[]args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score >1000) {
//            System.out.println("Your score is less than 5000 but greater than 1000");
//        }else if (score < 1000) {
//            System.out.println("Your score is less then 1000");
//        }else {
//            System.out.println("Got here");
//        }

        if (gameOver){
            int finalScore = score +(levelCompleted *  bonus);
            finalScore += 1000;
            System.out.println("Your final score is "+finalScore);

        }
        //(gameOver == true) is the same as (gameOver)

        if (gameOver){
            levelCompleted = 8;
            score = 10000;
            bonus = 200;

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is "+finalScore);
        }




    }
}
