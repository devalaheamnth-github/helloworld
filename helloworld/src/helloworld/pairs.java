package helloworld;

import java.util.Scanner;

public class pairs 
{
	static long sumofdigits(long n)
	{
	long sum=0;
		while(n!=0)	
		{
		long r=n%10;
		sum=sum+r;
		n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long number=sc.nextInt();
		long count=0;
		long m = 1000000007;
		for(long i=0;i<=number;i++)
		{
		for(long j=0;j<=number;j++)
			{
			if(sumofdigits(i)<sumofdigits(j))
				{
				count=count+1;
				}
			}
		}
		System.out.println(count%m);
	}
}

