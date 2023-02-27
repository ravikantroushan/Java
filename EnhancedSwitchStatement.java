public class EnhancedSwitchStatement {
    public static void main(String[] args) {
   int count = 46;
   switch (count) {
       case 1 -> System.out.println("Yes");
       case 2 -> System.out.println("No");
       case 3 -> System.out.println("Happy");
       case 4 , 5, 6 -> System.out.println("All last three");
       default -> System.out.println("Baby Boss");

   }

    }
}
