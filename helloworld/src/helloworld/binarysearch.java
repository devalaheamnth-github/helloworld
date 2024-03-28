package helloworld;
import java.util.*;
public class binarysearch {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key= sc.nextInt();
		boolean flag=false;
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
		int mid=(start+end)/2;
		if(key== arr[mid])
		{
			 System.out.println(key+ "found at"+mid);
			 flag=true;
			 break;
		}
		if(key>arr[mid])
		{
			start=mid+1;
		}
		if(key<arr[mid])
		{
			end=mid-1;
		}
		}
		if(flag==false)
		{
			System.out.println(-1);
		}
		
	}

}
