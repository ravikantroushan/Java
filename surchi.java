import java.util.Scanner;

public class surchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (18 <= age) {
            System.out.println("You are adult.");
        } else {
            System.out.println("You are not adult");

        }
    }
}