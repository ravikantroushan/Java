public class codingex3 {
    public static void main(String[] args) {
       boolean a = shouldWakeUp(true,1);
        System.out.println(a);
        boolean b = shouldWakeUp(false, 2);
        System.out.println(b);
        boolean c  = shouldWakeUp(true, 8);
        System.out.println(c);
        boolean d =  shouldWakeUp(true, -1);
        System.out.println(d);


    }
    public static boolean shouldWakeUp (boolean barking , int hourOfDay){
        if (hourOfDay>=0 && hourOfDay<=8 ) {
            barking = true;
            System.out.println(barking);

        } else if (hourOfDay>=9 && hourOfDay<=21) {
            barking = false;
            System.out.println(barking);
        }

        else if (hourOfDay>=22 && hourOfDay==23) {
          barking = true;
            System.out.println(barking);
        } else {
            System.out.println(" enter hours between 0 to 23");
        }

      return barking;
    }
}
