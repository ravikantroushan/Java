public class DigiSumChallenge {
    public static void main(String[] args) {
        System.out.println("The number is sum of all numbers "+sumdigits(1234));
        System.out.println("The number is sum of all numbers "+sumdigits(-125));
        System.out.println("The number is sum of all numbers "+sumdigits(4));
        System.out.println("The number is sum of all numbers "+sumdigits(457));
    }
    public static int sumdigits(int number){
       if (number<0){
           return -1;
       }
        int sum =0;
       while (number>9){
           sum+=number%10;
           number=number/10;
       }
       sum=sum+number;
        return sum;
    }
}