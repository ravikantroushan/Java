import java.util.Scanner;

public class sapna {
    public static void main (String[]args){
//        int [] marks = new int[3];
//        marks[0]= 40;
//        marks[1]=99;
//        marks[2]=87;
//        System.out.println(marks[2]);
//        for (int i = 0; i<3; i++){
//            System.out.println(marks[i]);


        Scanner sapu = new Scanner(System.in);
        int size=sapu.nextInt();
        int[] file= new int[size];
        for (int i = 0; i < size; i++) {
            file[i] = sapu.nextInt();
        }
            int c =sapu.nextInt();

        for (int i = 0; i <file.length ; i++) {
            if (i==c){
                System.out.println(i);
                System.out.println(file[i]);

            }
        }



    }
    }

