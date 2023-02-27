import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input;
            do {
                int marks = sc.nextInt();
                if (marks <= 90) {
                    System.out.println("This is good");
                } else if (89 >= marks && marks >= 60)
                {
                    System.out.println("This is also good");
                } else if (59>= marks && marks>= 0) {
                    System.out.println("This is Good as well");

                }
                System.out.println("next student for click 1 and stop for click 0");
                input = sc.nextInt();
            } while (input==1);
        }
    }

