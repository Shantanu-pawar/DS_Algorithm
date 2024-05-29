package Questions_nd_CONCEPTS.I11I_Binary_Search;

import java.util.*;

class c_Find_Minimum_Removals{
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=  in.nextInt();
        int k = in.nextInt();

        int []arr = new int [n];
        for(int i=0; i<n; i++)
        arr[i] = in.nextInt();

        System.out.println(find(arr, n, k));
	}

	public static int find(int []arr, int n, int k) {
	    Arrays.sort(arr);
	    int ans= n-1; // assume this value clear outin dryRun

	   //case1 : find the correct elemet's to remove from arr here
        for(int i=0; i<n; i++) {
            int pos = binary(arr,  n,  k, arr[i], i);

        // case 2: if your pos is not negetive then only do this step
            if(pos != -1)
                ans = Math.min(ans, n-(pos-i+1));

        }
        return ans;
	}

	static int binary(int []arr, int n, int k, int key, int i) {
	    int start = i+1;
	    int end = n;
	    int index = -1; // store the index value dummy variable
	    while(start < end) {
	        int mid = start +(end-start)/2;

	        if(arr[mid] - key <= k) {
	            index = mid;
	            start = mid+1;
	        }
	        else end = mid;
	    }
	    return index;
	}
}
