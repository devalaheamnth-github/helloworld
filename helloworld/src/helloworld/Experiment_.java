package helloworld;

public class Experiment_ {
	public static int[] withoutTen(int[] nums) {//10 13 10 14 --> 13 14 0 0 
		  int lastTenIndex = Integer.MAX_VALUE; // 13 0 10 14  13 0  0 14  
		  
		  for(int i=0;i<nums.length;i++)
		  {
		    
		    if(nums[i]==10)
		    {
		      nums[i] = 0;
		      lastTenIndex = Math.min(lastTenIndex , i);
		    }else{
		      if(lastTenIndex!=Integer.MAX_VALUE)
		      {
		    	  int temp = nums[i];
			      nums[i] = nums[lastTenIndex];
			      nums[lastTenIndex] = temp;
			      
			      lastTenIndex = i;
		      }
		      
		      
		    }
		  }
		  
		  return nums;
		}


	public static void main(String[] args) {
//		String str= "xxaxaxax";
//		
//		System.out.println(str.indexOf("ax",3));
		
		int nums[] = new int[5];
		nums[0]= 1;
		nums[1]= 10;
		nums[2]= 10;
		nums[3] = 2;
		nums[4] = 3;
		
		int arr[] = withoutTen(nums);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
