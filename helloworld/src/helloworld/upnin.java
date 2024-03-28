package helloworld;
import java.util.*;
import java.io.*;

public class upnin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a[0].length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			int li=0;
			int ri=a[i].length-1;
			while(li<ri)
			{
				int temp =a[i][li];
				a[i][li]=a[i][ri];
				a[i][ri]=temp;		
				li++;
				ri--;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
