package oops;
import java.io.*;
import java.util.*;

class binarysearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) 
    {
    	int start=Integer.MAX_VALUE;
    	int end=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
        	start=Math.min(start, stalls[i]);
        	end=Math.max(end,stalls[i]);
        }
        
        int ans=-1;
//        System.out.println(ans);
        
        while(start<=end)
        {
//        	System.out.println(ans);
            int mid=start+(end-start)/2;
            
            if(isPosibleToAssignCows(stalls,k,mid))
            {
                ans=mid;
//                System.out.println(ans);
//                end=mid-1;
                start=mid+1;
            }
            else{
//                start=mid+1;
            	end=mid-1;
            }
        }
        
        return ans;
    }
    
    static boolean isPosibleToAssignCows(int stalls[],int desiredCows,int desiredDistance)
    {
        int cows=0;
        int distance=0;
        int n=stalls.length;
        
        for(int i=0;i<n;i++)
        {
            distance=Math.abs(stalls[i]-distance);
//            System.out.print(distance + " "+ desiredDistance);
//            System.out.print(desiredDistance);
//            System.out.println();
            
            if(distance>=desiredDistance)
            {
                cows++;
//                System.out.print(cows+" "+desiredCows);
//                System.out.print(desiredDistance);
//                System.out.println();
                
                if(cows==desiredCows)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}