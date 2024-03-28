package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class special_sum_of_array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
    int a[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    for(int i=0;i<n;i++)
      {
        sum=sum+a[i];
      }
   while(sum>9)
     {
     int sum1=0;
       while(sum>0)
         {
           int r=n%10;
           n=n/10;
           sum1=sum1+r;
         }
       sum=sum1;
     }
    System.out.println(sum);
        
      
	}
}