package helloworld;
import java.util.*;
import java.io.*;

public class nintydegress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int li=0;
			int ri=n-1;
			while(li<ri)
			{
				temp=a[i][li];
				a[i][li]=a[i][ri];
				a[i][ri]=a[i][li];		
				li++;
				ri--;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		
		

	}

}
