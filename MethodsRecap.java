public class MethodsRecap {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted= 6;
        int bonus = 100;
        int finalscore = score;
        int highscore= calculatorscore(gameover,score, levelcompleted,bonus);
        System.out.println(highscore);

        score =10000;
        levelcompleted = 8;
        bonus = 200;
        finalscore = score;
        System.out.println("Your new final score was " +calculatorscore(gameover, score,levelcompleted,bonus));

        }

    public static int calculatorscore( boolean gameover , int score , int levelcompleted , int bonus ) {
//        boolean gameover = true;
//        int score = 800;
//        int levelcompleted= 5;
//        int bonus = 100;
        int finalscore = score;
        if (gameover ) {
            finalscore += (levelcompleted*bonus);
            finalscore+= 1000;
            System.out.println("Your final score was "+finalscore);
         }
        return finalscore;

    }

}

