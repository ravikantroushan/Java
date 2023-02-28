public class TheForStatementPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Here in this question in check 0 to 1000 between , which number is prime number and which is not prime. ");
        for (int i = 0; i <=1000 ; i++) {
            System.out.println(i+" number is"+(isprime(i)? " a " : " not ")+"prime number.");
        }

    }
    public static boolean isprime ( int number ) {
        if (number<=3){
            return (number == 2 || number==3);
        } else if (number%2==0 || number%3 ==0) {
            return false;
        }

        return true ;
    }

}
