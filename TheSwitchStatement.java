public class TheSwitchStatement {
    public static void main(String[] args) {
        int count=6;
        switch (count) {
            case 1 :
                System.out.println("i am Ravi");
                break;
            case  2 :
                System.out.println("I am Sapna");
                break;
            case 3 :
                System.out.println("I am Mohit");
                break;
            case 4 : case 5: case 6 :
                System.out.println("Hahahahaha");
                System.out.println("ha mai hu khalnayak "+count);
                break;
            default:
                System.out.println("i am ....");

        }
    }
}
