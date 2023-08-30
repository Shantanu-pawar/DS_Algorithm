package I2I_starterQues;

import java.util.Scanner;

public class o10_Nth_Number_Of_Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 0;
        int count  = 1;

        int ans = 0;
        while(n > 0) {
            n--;
            a = b;
            b = count ;
            count  = a + b;
            ans = a;
        }

        System.out.println(ans);
    }
}
