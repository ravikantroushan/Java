public class BonusChallengeSolution {
    public static void main (String[]args){
        System.out.println(getdurationtime(-7315));
        System.out.println(getdurationtime(-15,5));
        System.out.println(getdurationtime(3719));
        System.out.println(getdurationtime(124,68));
        System.out.println(getdurationtime(124,56));
    }
    public static String getdurationtime (int seconds){
        if (seconds<0) {
            return "Sapna your seconds are " + seconds + " negative value. Please mention postive value";
        }


           return getdurationtime(seconds/60,seconds%60);

    }
    public static String getdurationtime (int minutes , int seonds){
        if (minutes<0){
            return "Sapna your minutes "+minutes+" are negative value. Please mention positive value";
        }
        if (seonds<=0 || seonds>59){
            return "Sapna mam seconds "+seonds+" value is negative or more than 59. Please mention in seconds value in 1-59.";
        }

        return "Hi sapna this is get your answer Mota "+ minutes/60 +"h "+ minutes%60+"m "+seonds%60+"s ";
    }

}
