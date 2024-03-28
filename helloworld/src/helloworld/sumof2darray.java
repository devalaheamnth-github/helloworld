package helloworld;


import java.util.*;
import java.lang.*;
import java.io.*;

public class sumof2darray
{
	public static void main (String[] args) throws java.lang.Exception
	{
//		Scanner sc= new Scanner(System.in);
//  //     int n=sc.nextInt();
//     
//      int a[][]= {{1,4,5,0},{2,5,1,8},{3,4,9,8}};
//     
//      int sum=0;
//       for(int i=0;i<3;i++)
//        {
//          for(int j=0;j<4;j++)
//            {
//          sum=sum+a[i][j];
//            }
//        }
//      System.out.println(sum);
      
//      String s="1 2 3 4 5 6";
//      System.out.println(s);
//		String s=sc.next();
//		double b=2.236;
//		System.out.println(Math.floor(b));
//		System.out.println(Math.sqrt(9));
		int arr[]= {3,4,1,6,8,2};
		for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
		 for(int i=0;i<arr.length;i++)
	        {
	          System.out.print(arr[i]+" ");
	        }
	}
}