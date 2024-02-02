package I3I_2D_Array;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner (System.in);

        int [][] arr  = {
                {11, 12, 13, 14},
                {15, 16, 17, 18},
                {19, 20, 21, 22},
                {23, 24, 25, 26}  };

        int row = arr.length;
        int col = arr[0].length;

        int scol = 0, ecol = col - 1;
        int srow = 0, erow = row - 1;

/*
  now if you don't understand like why we take only arr[srow][i] here  ?
  so let's see : this is arr[row][col] = we know this
  now we put which one is vary and which is constant over here */

        while(srow <= erow && scol <= ecol){
            // col vary row is fixed => arr[row][col] => arr[srow][i]
            for(int i=scol; i<= ecol; i++) System.out.print( arr[srow][i] + " ");
            srow++;

            // here see col is fixed and row vary => arr[i][col]
            for(int i=srow; i<= erow; i++) System.out.print( arr[i][ecol] + " ");
            ecol--;

            // just dry run this case
            if(srow <= erow) {
                for(int i=ecol; i>= scol; i--) System.out.print(arr[erow][i] + " ");
                erow--;
            }

            if(scol <= ecol) {
                for(int i=erow; i>= srow; i--) System.out.print(arr[i][scol] + " ");
                scol++;
            }

        }
    }
}
