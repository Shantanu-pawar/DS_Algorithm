
import java.util.*;
import java.lang.*;
import java.io.*;

/*
next smaller element from right
5
input : 8 9  1 2 3 
outpt : 1 1 -1 -1 -1

*/

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n){ 

		n = arr.length;
        long []ans = new long[n];
        
        Stack<Long>st = new Stack <>();
        // nearest smaller element from right
        
        for(int i=n-1; i>= 0 ; i--) {
            
            while(!st.empty() && arr[i] <= st.peek()) st.pop();
            
            if(st.empty()) ans[i] = -1;
            
            else ans[i] = st.peek();
            
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
