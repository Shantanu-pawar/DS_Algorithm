package PAINDING;

/*

question 9 : Minimum sum of two numbers formed from digits of an array
Given an array of digits (values are from 0 to 9), find the minimum possible
sum of two numbers formed from digits of the array. All digits of given array
must be used to form the two numbers.

Examples :
Input: [6, 8, 4, 5, 2, 3]
Output: 604
The minimum sum is formed by numbers
358 and 246

Input: [5, 3, 0, 7, 4]
Output: 82
The minimum sum is formed by numbers
35 and 047

 */

import java.util.Arrays;

public class GFG_Q6_Minimum_SumOfTwo_Nos {
    // Function to find and return minimum sum of
    // two numbers formed from digits of the array.
    static int solve(int arr[], int n)
    {

        // sort the array
        Arrays.sort(arr);

        // let two numbers be a and b
        int a = 0, b = 0;
        for (int i = 0; i < n; i++)
        {

            // fill a and b with every alternate
            // digit of input array
            if (i % 2 != 0)
                a = a * 10 + arr[i];
            else
                b = b * 10 + arr[i];
        }

        // return the sum
        return a + b;
    }

    public static void main (String[] args){
        int arr[] = {6, 8, 4, 5, 2, 3};
        int n = arr.length;

        System.out.print("Sum is " + solve(arr, n));
    }
}


