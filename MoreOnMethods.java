public class MoreOnMethods {

    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted= 5;
        int bonus = 100;
        int finalscore = score;
        int high= calculatorscore(gameover,score, levelcompleted,bonus);
        System.out.println("The finalscore was "+ high);
        score =10000;
        levelcompleted = 8;
        bonus=200;
        int om = calculatorscore(gameover,score,levelcompleted,bonus);
        System.out.println("Your new finalscore was "+ om);

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

        }
        return finalscore;
    }

}

