public class TheForStatementMiniChallenge {
    public static void main(String[] args) {
//        Quesstion :- Using a new statement, call the calculateInterest method with the dollar amount of 100.
//                And this time , use the interest rates between 7.5 and 10 , but increment by a quarter of a
//                percent each time, meaning 0.25 percent .
//
//            And print results to the console window.
//           Also only call till 8.5 rate . And then next rate stop it.
        for (double r=7.5 ; r<=10; r=r+0.25){
            if (r>8.5){
                break;
            }
            System.out.println("100 dollar amount of  "+r+" interest is = "+calculateInterest(100,r)+" dollor interest");
        }

    }
    public static double calculateInterest (int amount , double rate){
        return (amount*rate)/100;
    }
}
