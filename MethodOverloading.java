public class MethodOverloading {
    public static void main(String[] args) {
//        int newscore = calculatrescore("Ravi", 50);
//        System.out.println("The new score is " + newscore);
//        int myscore = calculatrescore(75);
//        System.out.println(myscore);
//        calculatrescore();
        System.out.println("New Score is "+ calculatrescore("Ok",20));
        System.out.println("One more new score "+calculatrescore(2));
    }
    public static int calculatrescore (String playername , int score) {
        System.out.println("This "+playername+" is "+score+" score .");
        return score *10;
    }
    public static int calculatrescore (int score) {

        return calculatrescore("Rahul", 100);
    }
    public static int calculatrescore () {
        System.out.println("No player name no player score");
        return 0;
    }

}
