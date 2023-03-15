public class ThwWhileLoopChallenge2 {
    public static void main(String[] args) {
        int number = 4;
        int count =0;
        int even =0;
        int finishnumber =20;
        while (number<finishnumber && even<5){
            number++;
            if (!isEvenNumber(number)){
                count++;
                continue;

            }

            System.out.println(number);
            even++;

        }
        System.out.println("Even is count "+even);
        System.out.println("Odd number is count "+count);
    }
    public static boolean isEvenNumber (int number){
        if (number%2!=0){
            return false;
        } return true;
    }
}
