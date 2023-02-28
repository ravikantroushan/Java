public class TheForStatementChallenge {
    public static void main(String[] args) {
//        for ( int i =0 ; i<=1000; i++){
        int count = 0;
        for (int i = 10; count<3 &&i <=50 ; i++) {
            if (primenumber(i)) {
                System.out.println(i + " this is prime number");
                count++;
            }
//            } if (count ==3){
//                break;
//            }
        }  System.out.println("Number of time prime number "+count);




    }

    public static boolean primenumber(int number) {
        if (number <= 2) {
            return (number == 2 );
        }
      for (int divisor = 2 ; divisor<number/2 ; divisor++){
          if (number% divisor==0){
              return false;
          }
      }
        return true;
    }
}
