public class MoreSwitchStatement {
    public static void main(String[] args) {
        int switchvalue = 5;
        switch (switchvalue) {
            case 1 -> System.out.println("This is one.");
            case 2 -> System.out.println("This is two.");
            case 3 -> System.out.println("This is three.");
            case 4, 5, 6 ->
                    System.out.println("This is maybe four , five and six . And but this switch value is " + switchvalue);
            default -> System.out.println("This is end of era");
        }
        String month = "April";
        System.out.println(month+" is in the "+getQuarter(month)+" quarter. ");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "Feburary", "March" -> { yield "1st"; }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badresponse = month + " is bad";
                yield  badresponse ;
            }
        };
    }
    }

