import java.util.Scanner;

public class isprimenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n<=1){
            System.out.println("This is not prime number.");
            return;
        } for (int i= 1; i<=n/2; i++){
            if (n%i==0)
                count++;
        }
        if (count>1){
            System.out.println("This is not prime number.");
        } else {
            System.out.println("This is prime number.");
        }
    }
}