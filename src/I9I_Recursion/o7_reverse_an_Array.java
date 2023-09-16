package I9I_Recursion;

import java.util.Arrays;

public class o7_reverse_an_Array {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));

        // inplace reversal print this
//        reverse(arr, 0 ,arr.length-1);

        // for using extra space reversal
        int []ans = new int[arr.length];
        ans = IntReverse(arr, 0, arr.length-1, ans);
        System.out.println(Arrays.toString(ans));
    }

    /*note : when we use extra space it's SC is O(n) and it had N recursive call stack
    * so it's over all space complexity is O(n)
    *
    * and the TC : in both case is O(N) */

    // using extra space
    static int[] IntReverse(int []arr, int i, int j, int []ans){

        if(i == ans.length) return ans; // base termination of recursion

        ans[i] = arr[j];
        return IntReverse(arr, i+1, j-1, ans);
    }

    // inplace traversal of array.
    static void reverse(int []arr, int i, int j){
        if(i >= j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }
}
