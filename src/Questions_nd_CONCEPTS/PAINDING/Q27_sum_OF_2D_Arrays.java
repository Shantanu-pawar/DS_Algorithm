package Questions_nd_CONCEPTS.PAINDING;

public class Q27_sum_OF_2D_Arrays {

    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;

        //Initialize matrix a
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Calculates number of rows and columns present in given matrix
        rows = arr.length;
        cols = arr[0].length;

        //Calculates sum of each row of given matrix
        for(int i = 0; i < rows; i++){
            sumRow = 0;
            for(int j = 0; j < cols; j++){
                sumRow = sumRow + arr[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }

        //Calculates sum of each column of given matrix
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + arr[j][i];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);
        }


    }
}

