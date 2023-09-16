package I9I_Recursion;

import jdk.jshell.execution.JdiDefaultExecutionControl;

public class o6_count_all_digits {
    public static void main(String[] args) {
        // Question : we've to count all the digits from a number using recursion

        int n = count(2134);
        System.out.println(n);
    }

    static int sum = 0;
    static int count(int n){
        if(n == 0) return sum;

        int digit = n % 10;
        sum += digit;
        return count(n/10);
    }
}
