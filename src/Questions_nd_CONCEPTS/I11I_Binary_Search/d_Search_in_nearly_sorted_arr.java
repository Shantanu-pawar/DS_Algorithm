package Questions_nd_CONCEPTS.I11I_Binary_Search;

import java.util.*;

public class d_Search_in_nearly_sorted_arr{
	public static void main(String[] args) {

	 /* arr[] =  {10, 3, 40, 20, 50, 80, 70}
	 key = 40
	 Output: 2
	 if element not found then return -1;    */

	Scanner in = new Scanner(System.in);
	
	   int arr[] =  {10, 3, 40, 20, 50, 80, 70};
	   int n = arr.length;
        int target = 90;

        System.out.println(binarySearch(arr, target, n));        
	}
	
	static int binarySearch(int []arr, int target, int n) {
	    
	    int start = 0;
	    int end =n-1; 

	    while(start <= end) {
	        int mid= start+(end-start)/2;
	        
	        if(arr[mid] == target) return mid;
	        
	       //case 1:  this is to avoid segementation error like out of bound error 
	       
	        if(mid+1>= end && arr[mid+1] == target) return mid+1;
	        if(mid-1 >= start && arr[mid-1] == target) return mid-1;

            // case 2: do here mid-2 cause we actually find the further index also nah;
            if(arr[mid] > target) end = mid-2;
            else start = mid+2;
	    }
	    return -1;
	}
}

