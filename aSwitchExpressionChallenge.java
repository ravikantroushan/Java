public class aSwitchExpressionChallenge {
    public static void main(String[] args) {
        System.out.println(" Run code enhanced switch code with return statement. but method void used . And both variable use dayofweek & day\n");
        printDayofWeek(0);
        printDayofWeek(1);
        printDayofWeek(2);
        printDayofWeek(3);
        printDayofWeek(4);
        printDayofWeek(5);
        printDayofWeek(6);
        printDayofWeek(7);

        System.out.println("\nRun code if else code with void statement. And both variable use dayofweek & day\n");
        printweekDay(0);
        printweekDay(1);
        printweekDay(2);
        printweekDay(3);
        printweekDay(4);
        printweekDay(5);
        printweekDay(6);
        printweekDay(7);

    }

    public static void printDayofWeek(int day) {
        String dayofweek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thurdesday";
            case 5 -> "Friday";
            case 6 -> "saturday";
            default -> "Invalid day";

        };
        System.out.println(day +" stands for "+dayofweek+".");

    }
    public static void printweekDay (int day){
        String dayofweek = "Invalid day";
        if (day==0){
            dayofweek="Sunday";
        } else if (day==1) {
            dayofweek="Monday";
        } else if (( day==2)) {
            dayofweek="Tuesday";
        }else if (day==3){
            dayofweek="Wednesday";
        } else if (day==4) {
            dayofweek="Thuresday";
        } else if (day==5) {
            dayofweek="Friday";
        } else if (day==6) {
            dayofweek="Saturaday";
        }
        System.out.println(day+" stands for "+dayofweek+".");

    }
}
    

