package Questions_nd_CONCEPTS.PAINDING.BinaryQues;

import java.util.*;

public class Aggresive_Cows{}

class Solution{
    static boolean isPossible(int a[], int n, int cows, int minDist) {

        // so find mid, and check if the distance is greater or equals to mid for search spaces
        // tha'ts why do arr[i]-arr[0] >= arr[mid]

        int cntCows = 1;
        int lastPlacedCow = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        
        // it's fine when your count of cows is greter than provide cows 
        if (cntCows >= cows) return true;
        return false;
    }

    public static int aggressiveCows(int a[],int cows){
        Arrays.sort(a);
        int n=a.length;
        int low = 1;

        // now this high represent's the search space = lastIndex-firstIndex
		int high = a[n - 1] - a[0];

        while (low <= high) {
            int mid = (low + high) /2;
 
            if (isPossible(a, n, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));
 
         /* input :  6 4
                    0 3 4 7 10 9
            output : 3

         */
    }
}
