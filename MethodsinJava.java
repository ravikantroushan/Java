public class MethodsinJava {

    public static void main(String[] args) {
        int ram = 6;
        int pt =rahul(true,800,ram,100);// ram =levelcompleted
        System.out.println(pt);

    }

    //    public static void methodname (){
//    method process
//}

    public static int rahul(boolean gameover , int score ,int levelcompleted , int bonus) {
//
        int finalscore = score;
        if (gameover) {
            finalscore += (levelcompleted * bonus);
            finalscore += 1000; // finalscore+1000
            System.out.println("Your final score was " + finalscore);
        }
        return finalscore;

    }
}
