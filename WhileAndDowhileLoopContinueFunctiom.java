public class WhileAndDowhileLoopContinueFunctiom {
    public static void main(String[] args) {
//        int j =1;
//        while (true){
//            if ( j>5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//
//        }
//        boolean isready = false;
//        do {
//
//            if (j>5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isready = (j>0);
//        }while (isready);
        int nuumber =  0;
        while (nuumber<50){
            nuumber+=5;
            if (nuumber%10==0){
                continue;
            }
            System.out.print(nuumber+"__");
        }
    }
}
