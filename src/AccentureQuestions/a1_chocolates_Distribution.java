package AccentureQuestions;

/*
question 1 : Problem Description:
same problem statement as gfg: https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

*/




/* //question 2 : this is another problem 2D arry question
    this is parking lot where 1 represents space full and 0 represents null space
    now you've to return the rows where most parking space is fulled.*/

public class a1_chocolates_Distribution {

    public static void main(String[] args) {
        int [][]arr = {
                {1,0,0,1,0},
                {0,0,0,1,0},
                {1,1,0,1,0},
                {0,0,0,1,0},
                {1,0,0,1,0}
        };

// 1st i've swapped the array then i've find the colms max booked space
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i+1; j < row; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == 1) count++;
            }

            if(count >= max) {
                index = i;
                max = count;
            }
        }
        System.out.println(index + " " + max);

    }

}
