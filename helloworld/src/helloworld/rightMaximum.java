package helloworld;

public class rightMaximum {
	
	public static void findRightOddMaximumValue(int[] nums) {
		  int rightMaxOddValue[] = new int[nums.length];
		  
		  int rightMaximum = Integer.MIN_VALUE+1;
		  
		  for(int i=nums.length-1;i>=0;i--)
		  {
			 
		    rightMaxOddValue[i] = rightMaximum;
		    
		    if(nums[i]%2==1)
		    {
		    	 rightMaximum = Math.max(rightMaximum , nums[i]);
		    } 
		  }
		  
		  for(int i=0;i<rightMaxOddValue.length;i++)
		  {
			  System.out.print(rightMaxOddValue[i]+" ");
		  }
		}


	public static void main(String[] args) {

		int nums[] = {0,5,0,3}; 
		
		findRightOddMaximumValue(nums);

	}

}
