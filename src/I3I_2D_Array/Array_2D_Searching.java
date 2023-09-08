package I3I_2D_Array;

import java.util.Arrays;

public class Array_2D_Searching {

    public static void main(String[] args) {

//        search linearly in 2d Arrays
        int [][] arr = {
                {10, 22, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int []search (int [][]matrix ,int target){
        int r = 0;
        int c = matrix.length -1 ;

        int []ans = {-1, -1};

        while (r < matrix.length && c >=0) {

            if (matrix[r][c] == target) {
                ans[0] = r;
                ans[1] = c;
            }

            if(matrix[r][c] < target)  r++;

            else  c--;

        }
        return ans;
    }
}
