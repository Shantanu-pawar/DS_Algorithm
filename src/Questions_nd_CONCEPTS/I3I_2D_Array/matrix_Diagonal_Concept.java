package Questions_nd_CONCEPTS.I3I_2D_Array;
/* Question :
the question is we want both side diagonal is non zero
and rest all element's is zero like i showed in below matrix - so if it's fit in criteria return 1

      3
      1 0 2
      0 2 0
      3 0 1
      output : perfect
      __________________
      3
      1 0 1
      1 2 0
      2 0 3
      output : not perfect
*/

public class matrix_Diagonal_Concept {
    public static void main(String[] args) {
        int [][]arr = {
                {1, 0, 1},
                {0, 20, 0},
                {2, 0, 3} };

        int n = arr.length;
        System.out.println(special2(arr, n));
    }

    static String special2(int [][] matrix, int n){
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // for right diagonal
                if (i == j) {
                    if(matrix[i][j] == 0) flag = false;
                }

                // for left-side diagonal
                else if ( i + j == n - 1 ) {
                    if(matrix[i][j] == 0) flag = false;
                }

                else {
                    if(matrix[i][j] != 0) flag = false;
                }
            }
        }

        if(flag) return "perfect arr";
        else return "not perfect arr";
    }
}
