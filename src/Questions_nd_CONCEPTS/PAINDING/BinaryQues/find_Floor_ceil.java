import java.util.*;

	public class Main {
    public static int[] floorAndCeil(int key, int[] arr) {
        int [] ans = new int[2];
        
		ans[0] = floor(key, arr);
		ans[1] = ceil(key, arr);

        return ans;
    }
    
	static int ceil (int key, int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		int ans = -1;

		
		while(start <= end) {

        int mid = start+(end-start)/2;
			if(arr[mid] == key) return arr[mid];
			
			else if(arr[mid] < key) {
			    ans = arr[mid];
			    start = mid+1;
			}
			
			else end = mid-1;
		}
		return ans;
	}
    
	static int floor (int key, int[] arr) {
		int start = 0; 
		int end = arr.length-1;
		int ans = -1;
		
		while(start<=end) {
    int mid = start+(end-start)/2;
    
			if(arr[mid] == key) return arr[mid];
			
			if(arr[mid] > key) {
			    ans = arr[mid];
			    end = mid-1;
			}
			
			else 
			start = mid+1;
		}
		return ans;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] result = floorAndCeil(key, arr);
        System.out.println(result[1] + " " + result[0]);
        sc.close();
    }
}
   
