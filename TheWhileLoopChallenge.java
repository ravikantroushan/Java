public class TheWhileLoopChallenge {
    public static void main(String[] args) {
       int number = 4;
       int finishnumber =20;
       while (number<finishnumber){
           number++;
           if (!isEvenNumber(number)){
               continue;
           }
           System.out.println(number);
       }

    }
    public static boolean isEvenNumber (int number){
       if (number%2!=0){
           return false;
       } return true;
    }
}
