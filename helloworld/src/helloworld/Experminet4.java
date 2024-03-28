package helloworld;

import java.util.Scanner;

public class Experminet4 {
	
	public boolean isEverywhere(int[] nums, int val) 
	{
		  if(nums.length==0 || nums.length==1)
		  {
		    return false;
		  }
		  
		  for(int i=0;i<nums.length;i++)
		  {
		    if(i==0)
		    {
		      if(nums[i+1]==val)
		      {
		        return true;
		      }
		    }
		    else if(i==nums.length-1)
		    {
		      if(nums[i-1]==val)
		      {
		        return true;
		      }
		    }else{
		        if(nums[i-1] == val && nums[i+1] == val)
		        {
		          return true;
		        }
		    } 
		  }
		  
		  return false;
		  
	} 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			
			
			int arr[] = new int [n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			

	}

}
