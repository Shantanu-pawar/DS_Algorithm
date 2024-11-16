package Questions_nd_CONCEPTS.I0I_Strings_SlidingWindows;


public class Test {
    public static void main(String[] args) {

        int n = 6;
        int [] nums = {1,2,3,4,5};
        int k = 3;

        find(n, nums, k);
    }

    static void find(int n , int []arr ,int k){

        int start = 0, end = 0, sum = 0;
        while(end < n-1){

            // expand kela end la;
            sum += arr[end]; // using prefix sum concept
            end++;


            // contraction of start
            while((end-start) > k && start < end) {
                sum -= arr[start];
                start++;
            }
            // operation
            if(k == end-start) System.out.println(sum + " ");
        }
    }
}
