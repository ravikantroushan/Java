public class codingex2 {
    public static void main(String[] args) {
        long a = toMilesPerHour(1.5);
        System.out.println(a);
        long b = toMilesPerHour(10.25);
        System.out.println(b);
        long c =toMilesPerHour(-5.6);
        System.out.println(c);
        long d = toMilesPerHour(25.42);
        System.out.println(d);
        long e = toMilesPerHour(75.114);
        System.out.println(e);


        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.144);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {

            return -1;
        }
        double milesPerHour = kilometersPerHour * 0.621;
        milesPerHour = Math.round(milesPerHour);
        return (long)milesPerHour;
        //
//         return (int) Math.round(kilometersPerHour * 0.621);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = (long) Math.round(kilometersPerHour / 1.609);

        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}