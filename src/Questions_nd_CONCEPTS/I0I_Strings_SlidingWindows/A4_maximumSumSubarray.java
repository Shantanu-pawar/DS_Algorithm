package Questions_nd_CONCEPTS.I0I_Strings_SlidingWindows;

import java.util.ArrayList;
import java.util.List;

public class A4_maximumSumSubarray {
    public static void main(String[] args) {
        Solutions s = new Solutions();

//        debug this solution :

//        Input:
//        N = 4, K = 2
//        Arr = [100, 200, 300, 400]
//        Output:
//        700
//        Explanation:
//        Arr3 + Arr4 =700, which is maximum.


        long ans = s.maximumSumSubArray(4, new ArrayList<>(List.of(100, 200, 300, 400)), 4);
        System.out.println(ans);
    }
}

class Solutions{
    static long maximumSumSubArray(int k, ArrayList<Integer> arr, int n){

        int start = 0, end = 0;
        long windowSum = 0;

        for(int i=0; i<k; i++){
            end++;
            windowSum += arr.get(i);
        }


        long sum = windowSum;
        while(end < n){

            sum += arr.get(end) - arr.get(start);

            windowSum = Math.max(sum, windowSum);
            start++;
            end++;
        }

        return windowSum;
    }

}