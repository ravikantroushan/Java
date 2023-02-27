public class TheforStatement {
    public static void main(String[] args) {
        for (int counter =1 ;  counter <=5; counter++){
           double newvalue = calculateintertest(100,counter);
            System.out.println(newvalue);

        }
    }
    public static double calculateintertest( int pa , int rate){// here time was 1 year and si for one year calculation
        // si=p*r*t/100 formula and here use different rate
        double si = (pa * rate)/100;
        return si;
    }
}
