
// Find the number of occurrences of an element in a sorted array

public class Main {
	public static void main(String[] args) {
       
       int [] arr ={4, 4, 8, 8, 8, 8, 8, 8, 8, 15, 16, 23, 23, 42};
       int target = 8;

        int ans1 = (firstIndex(arr, target));
        int ans2 = (lastIndex(arr, target));
        
        int count = (ans2 - ans1) + 1;
        System.out.println("now findout how many target elements present in here: " + count);
	}
	  
    
	static int firstIndex (int [] arr, int target) {
	   int start = 0;
	    int end = arr.length-1;
	    int index = -1;
	    
	    while(start <= end) {
	        int mid = start +(end-start)/2;
	        
	        if(arr[mid] == target) {
	            index = mid;
	            end = mid-1;
	        }
	        
	        else if(target < arr[mid]) end=mid-1;
	        else if(target > arr[mid]) start=mid+1;
	    }
	    return index;
	}
	
	static int lastIndex (int [] arr, int target) {
	    int start  =0;
	    int end = arr.length-1;
	    int index = -1;
	    
	    while(start <= end) {
	        int mid = start +(end-start)/2;
	        
	        if(arr[mid] == target) {
	            index = mid;
	            start  = mid+1;
	        }
	        else if(target > arr[mid]) start =mid+1;
	        else if(target <arr[mid]) end = mid-1;
	    }
	    return index;
	}
}

