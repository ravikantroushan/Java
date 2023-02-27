import java.util.Scanner;

public class sachin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       switch (num){
           case 0 :
               System.out.println("stop");
               break;
           case 1 :
               int marks = sc.nextInt();
               if (marks>=90){
                   System.out.println("This is Good");
               } else if (89 >=marks || marks>= 60) {
                   System.out.println("This is also good");
                   
               } else if (59 >=marks || marks>= 0) {
                   System.out.println("This is Good as well");

               }
               break;
           default:
               System.out.println("you choose wrong code");
           }
       }

    }

