package AccentureQuestions;

// questions 10 : return the carry when we're doing sum

// Try this question : sum of two strings https://www.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1

import java.util.Arrays;

public class a13_CarryReturn { // started 10:21
    public static void main(String[] args) {
//        int [] arr = {1,2,4,5,6};
//        int [] brr = {8,8,6,4};

        int []arr = {2,3};
        int []brr = {5,6,3};
        int n = solve(arr, brr);
        System.out.println(n);
    }

    static int solve(int []arr, int []brr){
        int i = arr.length-1;
        int j = brr.length-1;
        String ans = "";

        int carry = 0;
        int sumCarry = 0;
        while(i >= 0 || j >= 0){
            int digit1 = 0;
            if(i >= 0) {
                digit1 = arr[i]; i--;
            }
            int digit2 = 0;
            if(j >= 0){
                digit2 = brr[j]; j--;
            }

            int sum = digit1 + digit2 + carry;
            carry = sum /10;
            sumCarry += carry;
            ans = ans + (sum%10); // last digit insertion
        }
        // case : if carry is remaining in that case
        if(carry > 1) ans += carry;

        StringBuilder sb = new StringBuilder(ans);
        ans = sb.reverse().toString();
        System.out.println(ans);

        int []ansArr = new int[ans.length()];

        for(int s = 0; s<ans.length(); s++){
            ansArr[s] = ans.charAt(s) - '0';
        }
        System.out.println(Arrays.toString(ansArr));
        return sumCarry;
    }
}
