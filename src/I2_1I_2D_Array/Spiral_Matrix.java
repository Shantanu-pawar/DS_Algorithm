package I2_1I_2D_Array;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner in = new Scanner (System.in);

        int [][] arr  = {{11, 12, 13, 14},
                {15, 16, 17, 18},
                {19, 20, 21, 22},
                {23, 24, 25, 26}  };

        int row = 4;
        int col = 4;

        for(int i=0; i<row ;i++) {
            for(int j=0; j<col ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");


        int scol = 0;
        int srow = 0;
        int ecol = col-1, erow = row-1;

        while(srow <= erow && scol <= ecol ) {
            for(int i=scol; i<= ecol; i++) System.out.print(arr[srow][i] + " ");
            srow ++;

            for(int i=srow; i<= erow; i++) System.out.print(arr[i][ecol] + " ");
            scol--;



            if( srow <= erow ) {
                for(int i=ecol; i>= scol; i--) System.out.print(arr[erow][i] + " ");
                erow--;
            }

            if(scol <= ecol) {
                for(int i=erow; i>= srow; i--) System.out.print( arr[i][scol] + " ");
                scol++;
            }

        }

    }
}