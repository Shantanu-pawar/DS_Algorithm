package I1I_Patterns;

public class Patterns {
    public static void main(String[] args) {

    //  here you can only change the functions
        pattern31(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            // basically here the change is only increase one line output
            // if we start row  =1 or row =0 one line add

//             for every row run the column
            for (int col = 1; col <= row  ; col++) {
                System.out.print( " * ");
            }
//            when one row print we need to add a new line
            System.out.println();

        }
    }
    /*

    output :
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *

     */


    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n ; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /*
    output :

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *

     */

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {

            for (int col = 0; col < n - row+1; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
/*
output :

 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *


 */

    static void pattern4(int n){

        for (int row = 1 ; row <= 4 ; row++) {

            for (int col = 1 ; col <= row ; col++) {

                System.out.print(col + " ");
//                we actually print here the column numbers
            }
            System.out.println();

        }
    }
/*
output :

1
1 2
1 2 3
1 2 3 4

 */

    static void pattern5(int n){
        for (int row  = 0; row  < 2 * n  ; row ++) {

//            everything is same but only put formula in c that's it.
            int totalColsInRow = row > n ? 2 * n - row  : row ;

            for (int col = 0; col < totalColsInRow ; col++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    /*
    output :

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *
 *  *
 *

     */


    //in this question all covers like spaces also

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    output :
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
     */

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    /* output :

      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4

     */

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
    /*
    output :

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

     */


    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    /*
    output :

4 4 4 4 4 4 4 4 4
4 3 3 3 3 3 3 3 4
4 3 2 2 2 2 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 1 0 1 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 2 2 2 2 3 4
4 3 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4 4

     */


}
