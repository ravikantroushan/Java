public class MethodChallange {
    public static void main(String[] args) {
      int highscoreposition = calculateHighScoreposition(1500);
      DisplayHighscorePosition("Ravi",highscoreposition);

      highscoreposition = calculateHighScoreposition(1000);
      DisplayHighscorePosition("Rahul",highscoreposition);

      highscoreposition = calculateHighScoreposition(500);
      DisplayHighscorePosition("Sachin",highscoreposition);

      highscoreposition = calculateHighScoreposition(100);
      DisplayHighscorePosition("Vikash",highscoreposition);

      highscoreposition = calculateHighScoreposition(25);
      DisplayHighscorePosition("Mona",highscoreposition);

    }
    public static void DisplayHighscorePosition (String Playername , int  highscoreposition){
        System.out.println(Playername+" manged to get into position " + highscoreposition+ " on the high score list");
    }
    public static int  calculateHighScoreposition(int playerscore){
        int postion = 0;
        if (playerscore>=1000){
        postion = 1;
        } else if (playerscore>=500 && playerscore<1000){
            postion=2;
        } else if (playerscore>=100 && playerscore<500) {
            postion= 3;
        } else {
            postion= 4;
        }
       return postion;
    }

}
