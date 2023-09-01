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


    //  solve this pattern ques on link
    static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(1);
                } else if (j == 1 || j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }

// 	1
// 	11
// 	121
// 	1221
// 	12321


    static void pattern9(int n) {
        n = 5;
        char ch = 'A';
        for(int i=0; i<n; i++) {

            for(int j=0; j<=i ; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        }
    }

    // a
    // b c
    // d e f
    // g h i j
    // k l m n o

    static void pattern8(int n) {
        n = 5;
        int no = 1;
        for(int i=0; i<n; i++) {


            for(int j=0; j<= i; j++) {
                System.out.print(no + " ");
                no++;
            }
            System.out.println("");
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15


    static void pattern7(int n) {

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {

                if((i+j) % 2 == 0) System.out.print("1 ");

                else System.out.print("0 ");

            }
            System.out.println();
        }
    }

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1

    static void pattern6(int n) {
        n = 6;
        for(int i=0; i< n; i++) {

            // space
            for(int j=0; j< (n-i-1); j++)
                System.out.print(" ");

            // stars
            for (int j=0; j< (2*i+1) ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    /*
     *
     ***
     *****
     *******
     *********
     ***********

     */
    static void pattern51(int n) {

        for(int i=n; i>=0; i--) {
            for(int j=1; j<= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    static void pattern41(int n) {

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print(i + " "); // here i just change it to row
            }
            System.out.println();
        }
    }
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4


    static void pattern311(int n) {

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i ; j++) {
                System.out.print(j + " "); // here i just change it to col
            }
            System.out.println();
        }
    }
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4


    static void pattern211(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // *
    // * *
    // * * *
    // * * * *

    static void pattern111(int n){

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
}
