public class ifelseifandelse2 {
    public static void main(String[] args) {
        boolean mygameover = true;
        int score = 8000;
        int levelcompleted = 100;
        int tina = 80;                                                             
                                         
        if (score <                                                                                                                                      5000 && score > 1000) {
            System.out.println(" your score is less than 5000 and more than 1000. ");
        } else if ( score < 1000 ){
            System.out.println( " Your score is less than 1000 .");
        } else {
            System.out.println(" your score is empty .");
        }
    }
}
