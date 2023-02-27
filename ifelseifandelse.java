public class ifelseifandelse {
    public static void main(String[] args) {
        boolean gameover = true;
        int score =  5009;
        int levelcomplwted = 5;
        int  bonous = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000. ");
        }  else if ( score == 5000 ) { System.out.println( " Your score is equal to 5000  ");
        } else {
            System.out.println(" Your score is more than 5000 ");
        }

    }

}
