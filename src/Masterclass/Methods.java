package Masterclass;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 50000;
        levelCompleted = 15;
        bonus = 500;
        System.out.println("Your final score is " + calculateScore(gameOver, score, levelCompleted, bonus));


//        or

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

//        Method challenge time

        displayHighScore("Fred", calculateHighScorePosition(1500));
        displayHighScore("Tom", calculateHighScorePosition(50));
        displayHighScore("Steve", calculateHighScorePosition(900));
        displayHighScore("Rod",calculateHighScorePosition(400));
        displayHighScore("Louis", calculateHighScorePosition(1000));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;


    }

    public static void displayHighScore(String playerName, int position) {
        System.out.println(playerName + " managed to get into " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned

        if (score >= 1000){
            position=1;
        }else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return position;

    }


}


