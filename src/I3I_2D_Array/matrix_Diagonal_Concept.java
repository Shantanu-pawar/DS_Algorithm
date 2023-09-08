package I3I_2D_Array;
/* Question :
the question is we want both side diagonal is non zero
and rest all element's is zero like i showed in below matrix - so if it's fit in criteria return 1

      3
      1 0 2
      0 2 0
      3 0 1
      output : 1
      __________________
      3
      1 0 1
      1 2 0
      2 0 3
      output : 0
*/

public class matrix_Diagonal_Concept {
    public static void main(String[] args) {
        int [][]arr = {
                {1, 0, 1},
                {1, 2, 0},
                {2, 0, 3} };

        int n = arr.length;
        special2(arr, n);
    }

    static int special2(int [][] matrix, int n){
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    if(matrix[i][j] == 0) {
                        count++; break;
                    }
                }
                else if ( i + j == n - 1 ) {
                    if(matrix[i][j] == 0) {
                        count++; break;
                    }
                }
                else {
                    if(matrix[i][j] != 0) count++;
                }

            }
        }

        System.out.println("here if count is greater than 0, so return 0 else 1");
        if(count!=0) return 0;
        else return 1;
    }
}
