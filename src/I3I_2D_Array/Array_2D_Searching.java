package I3I_2D_Array;

import java.util.Arrays;

public class Array_2D_Searching {

    public static void main(String[] args) {
/*
        // this is how we print 2D arrays
        int [][]arr = {
                {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        for (int []rr : arr){
            System.out.println(Arrays.toString(rr));
        }
* */

//        if the array was sorted then only we can do this algorithm
        int [][] arr = {
                {10, 22, 30, 40}, {15, 25, 35, 45},
                {28, 29, 37, 49}, {33, 34, 38, 50} };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    // solve this using linear O(N) space
    static int[] search(int [][]arr, int target){
        int [] ans = new int[2];
        int r = 0;
        int c = arr[0].length-1;

        // since we're doing row++ and col--; so to avoid shrinkage
        while (r < arr.length && c >= 0){
            if(arr[r][c] == target) {
                ans[0] = r;
                ans[1] = c;
            }

            if(arr[r][c] > target) c--;
            else r++;
        }
        return ans;
    }
}
