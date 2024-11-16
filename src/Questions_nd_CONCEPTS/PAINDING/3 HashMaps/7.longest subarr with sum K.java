import java.util.*;

class Accio{
    static int LongestSubArraywithSumK(int n, int k, int[] arr){
		// case 1 : find if sum-k is actually present in map or not
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0, ans = 0;

		// base case : you need to store this defalut val
		map.put(0, -1);
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; // store each elment and make sum till now
			if(map.containsKey(sum-k)) {
				int j = map.get(sum-k);

		// case 2: now find max subArr from ans, and i-j to store val
				ans = Math.max(ans, i-j);
			}
			
		// case 3 : just store the sum if it's not present in map
			if(!map.containsKey(sum))
				map.put(sum, i);
		}
		return ans;
    }
}


// // neive solution O(nn) approach
// class Accio{
//     static int LongestSubArraywithSumK(int n, int k, int[] arr){
// 		int max =0; 
// 		for(int i=0; i<arr.length; i++) {
// 			int sum =0 ;
// 			int count = 0;
// 			for(int j=i; j<arr.length; j++) {
// 				sum += arr[j];
// 				count++;
				
// 				if(sum == k) // always store max count here
// 					max = Math.max(max, count);
// 			}
// 		}
// 		return max;
// 	}
// }


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans = obj.LongestSubArraywithSumK(n,k,nums);
        System.out.println(ans);
    }
}
