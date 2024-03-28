package helloworld;
import java.util.*;
import java.lang.*;
import java.io.*;

public class taking_input
{
  
	public static void main (String[] args) throws java.lang.Exception
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int nums[]=new int[n];
  for(int i=0;i<n;i++)
    {
      nums[i]=sc.nextInt();
    }
  int target=sc.nextInt();
  int start=0;
		int end=nums.length -1;
        int mid=0;
        
        while(start<=end){
            mid = (start+end)/2;
            
            if(nums[mid]==target){
                 mid=mid;
                 break;
            }else if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }
        }
        if(target>nums[mid])
            System.out.println( mid+1);
        else
        	System.out.println(mid);
	}
}