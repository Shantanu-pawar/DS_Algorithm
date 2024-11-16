package Questions_nd_CONCEPTS.PAINDING.BinaryQues;


public class Bitonic_Arr_Find_Target_Element{
	public static void main(String[] args) {

         int [] arr = {5, 6, 7, 8, 9, 10, 3, 2, 1};
         int target = 6;  

         System.out.println(solve(arr, target));

	}

     static int solve(int[] arr, int target) {
        
        int s = 0;
        int e = arr.length-1;
        
        while(s <e) {
            int mid = s +(e-s) / 2;
            
            if(arr[mid] > arr[mid+1]) e = mid;
            else s = mid +1;
        }
        int ans = arr[s];  //here just check the elemnt and target
        if(ans == target) return s;
        
        int start = 0;
        int end = arr.length-1;
        int ans1 = ascBS(arr, target, start, ans-1);
        int ans2 = desBS(arr, target, ans+1, end);
        
        if(ans1 > ans2) return ans1;
        else return ans2;
    }
    
    static int ascBS(int []arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start +( end-start)/2;
            
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    
    static int desBS(int []arr, int target, int start, int end){
        while(start <= end) {
            int mid = start +( end-start)/2;
            
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) end = mid-1;
            else start = mid+1;
        }
        return -1; 
    }
}

	


