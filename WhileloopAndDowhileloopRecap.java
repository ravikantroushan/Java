public class WhileloopAndDowhileloopRecap {
    public static void main(String[] args) {
        int i =0;
        while (i<15){
            i++;
            if (i<=5){
                System.out.println("skip number"+i);
                continue;
            }
            System.out.println("number "+i);
            if (i>=10){
                System.out.println("break number "+i);
                break;
            }
        }
    }
}
