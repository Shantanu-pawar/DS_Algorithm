package Questions_nd_CONCEPTS.I0I_Strings_SlidingWindows;


public class sum_of_allSubArrs_of_Size_K {}

// Question : course.acciojob.com/idle?question=605fc5cb-a7ea-40a5-b1e3-014f6414be43

class Solution {
    public static void main(String[] args) {
        int n = 6;
        int [] nums = {1,2,3,4,5};
        int k = 3;
        SumofAllSubarraysofSizeK(n, k, nums);
    }

    static void SumofAllSubarraysofSizeK(int n, int k, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end < n-1) {
            // expansion
            sum += nums[end];
            end++;

            // contraction
            while (start < end && (end - start) > k) {
                sum -= nums[start]; // remove current index
                start++;
            }

            // operation of checking
            if (end - start == k)
                System.out.print(sum + " ");
        }
    }
}
