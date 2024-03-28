
package helloworld;
import java.util.*;
import java.io.*;

public class foen
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int sum=0;
        while (n != 0) {
            int d = n % 10;
            n =n/10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }
            
           sum = sum+ f;
        }
        System.out.println(sum);
    }
}