
// https://course.acciojob.com/idle?question=73772158-09d5-4636-aa41-def2d3158102

import java.util.*;
import java.lang.*;
import java.io.*;


// bruitforce O(n*n)
    
//     	public static void main(String[] args) {		
// 		int []arr = {3, 5, 2, 8, 10, 13, 0, 0};
		
// 		for(int i =0; i<arr.length; i++) {
		    
// 		    int ans = -1;
// 		    for(int j=i+1; j<arr.length; j++) {
		        
// 		        if(arr[i] < arr[j]) {
// 		            ans = arr[j] ;
// 		            break;
// 		        }
// 		    }
// 		    	System.out.print(ans + " ");
// 		}
				    
// 	}


class Solution
{
    public static long[] nextLargerElement(long[] arr, int n){ 

		n = arr.length;
        long []ans = new long[n];
        
        Stack<Long>st = new Stack <>();
        
// 	    for(int i=0; i <= n-1 ; i++)   // for next largest elemt right side
        for(int i=n-1; i>=0; i--) {   // for next largest elemt from left side 
            
            while(!st.empty() && arr[i] >= st.peek()) {
                st.pop();
            }
            
            if(st.empty()) ans[i] = -1;
				
            else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
        
    }
}


class Main {
    public static void main (String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
