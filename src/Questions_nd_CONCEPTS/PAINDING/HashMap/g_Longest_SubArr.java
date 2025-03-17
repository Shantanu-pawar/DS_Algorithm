package Questions_nd_CONCEPTS.PAINDING.HashMap;

import java.util.HashMap;

public class g_Longest_SubArr {

    static int LongestSubArrayWithSumK(int n, int k, int[] arr){
        // case 1 : find if sum-k is actually present in map or not
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;

        // base case : you need to store this default val
        map.put(0, -1);

        for(int i=0; i<arr.length; i++) {
            sum += arr[i]; // store each element and make sum till now
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

    public static void main(String[] args) {
        LongestSubArrayWithSumK(7, 5, new int[]{1, 2, 3, 4, 5, 0, 0});
        neiveSolution(7, 5, new int[]{1, 2, 3, 4, 5, 0, 0});
    }

    static void neiveSolution(int n, int k, int[] arr){
        int max =0;
 		for(int i=0; i<arr.length; i++) {
 			int sum =0 ;
 			int count = 0;
 			for(int j=i; j<arr.length; j++) {
 				sum += arr[j];
 				count++;

 				if(sum == k) // always store max count here
 					max = Math.max(max, count);
 			}
 		}
        System.out.println(max);
    }
}

