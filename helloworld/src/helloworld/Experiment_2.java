
package helloworld;

import java.util.*;

public class Experiment_2 {
	public static boolean has77(int[] nums) {
		  if(nums.length==0 || nums.length==1)
		  {
		    return false;
		  }
		  
		  if(nums.length==2 && nums[0] ==7 && nums[1] ==7)
		  {
		    return true;
		  }
		  
		  
		  for(int i=0;i<nums.length-1;i++)
		  {
		    if(nums[i] ==7 && nums[i+1]==7)
		    {
		      return true;
		    }
		    if(i+2 <nums.length && nums[i]==7 && nums[i+2]==7 )
		    {
		      return true;
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
		
		
		boolean b =has77(arr);
		
		System.out.println(b+" ");
	

	}

}
