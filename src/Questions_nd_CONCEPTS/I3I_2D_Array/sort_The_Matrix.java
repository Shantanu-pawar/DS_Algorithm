package Questions_nd_CONCEPTS.I3I_2D_Array;

import java.util.Arrays;

public class sort_The_Matrix {
    public static void main(String[] args) {
        int [][] arr  =  {
                {30, 22, 15 },
                {15, 5, 3},
                {29, 19, 7},
                {3, 34, 8} };

        int n = arr.length; // gives rows length
        int m = arr[0].length; // gives col length

        System.out.println(n + " " + m);

        // SORT
        for(int i=0; i<n; i++)
            Arrays.sort(arr[i]);


        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
