public class Sum3and5Challenge {
    //Create a for loop using a range of number from 1 to 1000 inclusive.
    // Sum all the numbers that can by divided bt both 3 and 5.
    //Print out the numbers that have met the above conditions.
    //Break out of the loop once you found 5 numbers that met the conditions above.
    //After breaking out of the loop , print the sum of the numbers that met the conditions above.
    //Note : type all code in the main method.
    public static void main(String[] args) {
        int count =0;
        int sum= 0;
        for (int i = 1; count<5 && i<=1000 ; i++){
            if (i%3==0 && i%5==0){
                System.out.println("The condition of match "+i);
                count++;
                sum = sum+i;
            }

        }
        System.out.println("Number of add all these sum = "+sum);
        System.out.println("Number of count all these numbers = "+count);
    }
}
