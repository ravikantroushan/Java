public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(" Value is time = "+ getdurationstring(7265));
        System.out.println(" Value is time = "+ getdurationstring(121,62));

    }
    public static String getdurationstring(int seconds){
        int minutes = seconds/60;

        return getdurationstring(minutes,seconds);
    }
    public static String getdurationstring( int minutes , int seconds){
        int hour = minutes/60;
        minutes= minutes%60;
        seconds= seconds%60;

        return hour+ "h "+ minutes+"m "+seconds+  "s";
    }
}