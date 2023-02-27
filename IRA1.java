import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class IRA1 {
    public static void printSumTriangle(int[] A) {
        //Add code here
        if (A.length < 1)
            return;
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length - 1; i++)
        {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }
        printSumTriangle(temp);
        System.out.println(Arrays.toString(A));
    }


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] testcase = new int[n];

        for (int i = 0; i < n; i++) {
            testcase[i] = sc.nextInt();
        }
        printSumTriangle(testcase);
    }
}