package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class practice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                  			Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                        {
                                a[i]=sc.nextInt();
                        }
                int k=a.length+a.length;
                int ans[]=new int[k];
                for(int i=0;i<ans.length;i++)
                        {
                        if(i==a.length)
                        {
                                int z=0;
                                while(z<n && i<ans.length)
                                        {
                                                ans[i]=a[z];
                                                z++;
                                                i++;
                                        }
                                break;
                        }
                        else{
                                ans[i]=a[i];    
                        }
                   
                        }
                 for(int i=0;i<ans.length;i++)
                        {
                             System.out.print(ans[i]+" ");
                        }
	}
}