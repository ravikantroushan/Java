import java.sql.SQLOutput;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(" 5 Feet and 8 inches value is "+ convertToCentimeters(5,8)+" cm. ");

    }
    public static double convertToCentimeters ( int inches){
        return inches *2.54;
    }
    public static double convertToCentimeters ( int feet , int inches){
        return convertToCentimeters(((feet *12 )+inches));
    }
}