package helloworld;
import java.util.*;


public class experiment_7 {
	public static int[] getSortedArray(int arr1[] , int arr2[])
	{
		if(arr1.length == 0)
		{
			return arr2;
		}
		if(arr2.length == 0)
		{
			return arr1;
		}
		
		int ans[] = new int[arr1.length + arr2.length];
		
		
		int ansIndex = 0;
		int index1 = 0;
		int index2 = 0;
		
		while(index1 < arr1.length && index2 < arr2.length)
		{
			if(arr1[index1] < arr2[index2])
			{
				ans[ansIndex] = arr1[index1];
				
				ansIndex++;
				index1++;
			}else {
				ans[ansIndex] = arr2[index2];
				
				ansIndex++;
				index2++;
			}
		}
		
		if(index1<arr1.length)
		{
			for(int i=index1 ; i< arr1.length;i++)
			{
				ans[ansIndex] = arr1[i];
				ansIndex++;
			}
		}
		
		if(index2<arr2.length)
		{
			for(int i=index2 ; i< arr2.length;i++)
			{
				ans[ansIndex] = arr2[i];
				ansIndex++;
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		
		
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int ans[] = getSortedArray(arr1, arr2);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}

	}

}
