public class Sum3and5ChallengeMyOwnWay {
    //Create a for loop using a range of number from 1 to 1000 inclusive.
    //Sum all the numbers that can by divided bt both 3 and 5.
    //Print out the numbers that have met the above conditions.
    //Break out of the loop once you found 5 numbers that met the conditions above.
    //After breaking out of the loop , print the sum of the numbers that met the conditions above.
    //Note : type all code in the main method.
    public static void main(String[] args) {
        int count= 0;
        int m =0;
        int n=1;
        for (int i = 1; count<5 && i <=1000 ; i++) {
            i = n;
            m = n++;


            if (m%3==0 && m%5==0){
                System.out.println("This "+m+" number id divided both 3 & 5.");
                int t =0;
                t=m;
                m=m+t;
                count++;
            }
        }
        System.out.println("number time of count"+count);
        System.out.println("This is sum of all conditions , that 3 and 5 both divided "+(m+n-1));
    }
}
