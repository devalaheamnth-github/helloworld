package helloworld;
import java.util.*;
public class experiment {
	    public static double average(int[] salary) 
	    {
	        Arrays.sort(salary);
	        int sum=0;
	        for(int i=0;i<salary.length;i++)
	        {
	            if(i==0 || i==salary.length-1)
	            {
	                continue;
	            }
	            else{
	                sum=sum+salary[i];
	            }
	        }
	        double k=sum/salary.length-2;
	        return k;
	    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
                {
                        a[i]=sc.nextInt();
                }
        System.out.println(average(a));



	}

}
