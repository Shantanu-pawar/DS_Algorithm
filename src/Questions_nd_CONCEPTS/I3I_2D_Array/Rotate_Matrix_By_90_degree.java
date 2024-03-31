package Questions_nd_CONCEPTS.I3I_2D_Array;

public class Rotate_Matrix_By_90_degree {
    public static void main (String[] args) throws java.lang.Exception{

        int [][] arr  =  {
                {10, 22, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50} 	};

        int n = arr.length;

        for(int i=0; i<n ;i++) { // case 1: here just switch element's after diagonal
            for(int j= i + 1 ; j<n ; j++) {
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]  = temp;
            }
        }

        for(int i=0; i<n ;i++) { // case 2 : now just print the arr into reverse
            for(int j=n-1 ; j>=0 ; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
