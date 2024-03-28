package helloworld;

public class Experiment_3 {
	
	public boolean haveThree(int[] nums) {
		  if(nums.length<3)
		  {
		    return false;
		  }
		  int count = 0;
		  
		  for(int i=0;i<nums.length;i++)
		  {
		    if(i==0)
		    { 
		      if( nums[i] == 3 && nums[i+1] !=3 )
		        {
		          count ++;
		        }
		    }
		    else if(i==nums.length-1)
		    {
		      if( nums[i]==3 && nums[i-1]!=3)
		      {
		        count++;
		      }
		    }
		    else
		    {
		      if(nums[i]==3 && nums[i-1]!=3 && nums[i+1]!=3)
		      {
		        count++;
		      }
		    }
		  }
		  
		  if(count!=3)
		  {
		    return false;
		  }
		  
		  return true;
		}


	public static void main(String[] args) {
		
		
		char start = 'd';
        char end = 'a';
        for (char c = start; c >= end; c--) {
            System.out.print(c + " ");
        }
	}

}
