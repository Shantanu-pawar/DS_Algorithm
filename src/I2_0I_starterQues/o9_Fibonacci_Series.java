package I2_0I_starterQues;

import java.util.Scanner;

public class o9_Fibonacci_Series {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
//        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int count = 1;

        for (int i =1; i <= 16; i++) {
            a = b;
            b = count;

            count  = a + b;
            System.out.print(a + " ");
        }
    }

}
