/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
    // Ques link : https://leetcode.com/problems/search-in-rotated-sorted-array/
    
    
	public static void main(String[] args) {
		int [] arr = {4, 5, 6, 7, 0, 1, 2, 3};
		
		System.out.println(pivot(arr));
	}
	
// 	step 2
	static int search(int [] nums, int target) {
	    int ans = pivot(nums);
	    
	    // this means your arr is not rotated so do normal BS
	    if(ans == -1) {
	       return binarySearch(nums, target, 0, nums.length-1 );
	    }
	    
	   // if you find pivot means you find 2 asc shorted arrs
	   if(nums[ans] == target)   return ans;
	   
	   if (target >= nums[0] ) {
	       return binarySearch(nums, target, 0, ans-1) ;
	   } 
	   
	   return binarySearch(nums, target, ans + 1, nums.length -1 );
	   
	}
	
// 	step 3: don't forget to create else if chain in while condition, cause it prevent erros 
	static int binarySearch(int []arr, int target , int start, int end){
	  
	    
	    while  (start <= end) {
	        int mid = start + (end-start)/2;
	        
	        if(arr[mid] > target) end = mid -1;
	        
	        else if(arr[mid] < target) start = mid+1;
	        
	        else return mid;
	    }
	    return -1;
	}
	
	
// 	step 1 :here pivot point means we actually find the two arrays 
	 static int pivot (int [] arr) {
	     int  start= 0;
	     int end = arr.length -1;
	     
	   while(start <= end) {
	       int mid = start + (end-start)/2;
	        
	       //5 6 7 8 1 2 3
	       //to avoid out of bound index, this mid<end case required
        if(mid < end && arr[mid] > arr[mid+1]) return mid;
        
        if(mid > start && arr[mid] < arr[mid-1]) return mid-1;
        
        if(arr[mid] <= arr[start] ) {
            end = mid-1;
        }
        else start = mid+1;
        
	   }
	   return -1;
	   
	 }
}

