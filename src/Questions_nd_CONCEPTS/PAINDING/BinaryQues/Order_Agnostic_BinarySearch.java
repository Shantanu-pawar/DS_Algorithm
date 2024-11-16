public class Main
{
	public static void main(String[] args) {
//             int [] arr =  {15, 14, 13, 12, 11, 10, 9, 8, 5, 4, 3, 2, 1};  // {8};
	
            int [] arr =  {2, 3};
            int target = 3;
            int n = arr.length;
            
            // corner case : if arr is null 
            if(arr.length == 0) {
                System.out.println("ARr is null"); 
            }
            
            else if(arr[0] < arr[n-1]) {
                System.out.println(ascending(arr, target));
            }
		
            else System.out.println(decending(arr, target));
	}
	
	static int ascending (int [] arr, int target) {
	   int start = 0;
	    int end = arr.length-1;
	    
	    while(start <= end) {
	        int mid = start +(end-start)/2;
	        
	        if(arr[mid] == target) return mid;
	        else if (arr[mid] > target) end = mid-1;
	        else if(arr[mid] < target) start = mid+1;
	        
	    }
	    return -1;
	}
	
	static int decending (int [] arr, int target) {
	    int start  =0;
	    int end = arr.length-1;
	    
	    while(start <= end) {
	        int mid = start +(end-start)/2;
	        
	        if(arr[mid] == target) return mid;
	        else if (arr[mid] < target) end = mid-1;
	        else if(arr[mid] > target) start = mid+1;
	        
	    }
	    return -1;
	}
}
