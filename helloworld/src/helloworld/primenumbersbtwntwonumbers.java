package helloworld;

import java.util.Scanner;

public class primenumbersbtwntwonumbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n= sc.nextInt();
		for(int j=m;j<=n;j++)
		{
			int count=0;
		for(int i=1;i<=j;i++)
		{
			
			if(j%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(j);
		}
		}
	}

}
