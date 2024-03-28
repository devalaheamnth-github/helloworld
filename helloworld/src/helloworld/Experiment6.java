package helloworld;
import java.util.*;

public class Experiment6 {
	
	public static List<String> isAmstrong(List<Integer> arr)
	{
		ArrayList<String> list = new ArrayList<String>();
		
//		System.out.println("about to execute for loop with" + arr.size());
		
		for(int i=0;i<arr.size();i++)
		{
//			System.out.println("in for loop");
			
			int num = arr.get(i);
			int temp = num;
			
			int sum = 0;
			
			while(num>0)
			{
//				System.out.println(" in  while loop");
				int r = num%10;
				sum = sum  +(r*r*r);
				num = num/10;
				
			}
//			System.out.println(" below while loop");
			
			if(sum == temp)
			{
//				System.out.println(" in if");
				list.add("It is an ARMSTRONG number");
			}else {
//				System.out.println(" in else");
				list.add("It is NOT an ARMSTRONG number");
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
//			System.out.println("insert element");
//			System.out.println();
			int num = sc.nextInt();
			
			list.add(num);
			
			
		}
		
		System.out.println("Input taken");
		
		List<String> alStr =  isAmstrong(list);
		
		for(int i=0;i<alStr.size();i++)
		{
			System.out.println(alStr.get(i));
		}
		
		
		
		
		

	}

}
