package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class product_of_array_but_not_itsekf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
     
      for(int i=0;i<n;i++)
        {
           int p=1;
          for(int j=0;j<n;j++)
            {
              if(i==j)
              {
                continue;
              }
            p=p*a[j];
            }
          b[i]=p;
        }
      for(int i=0;i<n;i++)
        {
          System.out.print(b[i]+" ");
        }
      
	}
}