package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class recursion
{
        public static void printpattern(int n)
        {
                System.out.print(n);
                if(n<=0)
                {
                        return;
                }
                printpattern(n-5);
                System.out.print(n);
        }
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                printpattern(n);
	}
}