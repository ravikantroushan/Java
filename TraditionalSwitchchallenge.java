import java.util.Scanner;

public class TraditionalSwitchchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char namechar =sc.next().charAt(0);
        switch (namechar) {
            case 'A' -> System.out.println(" A is Able");
            case 'B' -> System.out.println(" B is Baker");
            case 'C' -> System.out.println("C is Charlie");
            case 'D' -> System.out.println("D is Dog");
            case 'E' -> System.out.println("E is Easy");
            default -> System.out.println(" Wrong Charater Choose");

        }
    }
}
