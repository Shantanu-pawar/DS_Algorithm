package I2I_starterQues;

import java.util.Scanner;

public class o1_primeNumber {
    public static void main(String[] args) {

        int n = 120;
        for (int num = 1; num <= n ; num++) {

            // logic of prime number
            boolean check = false;

            for (int i = 2; i < num-1; i++){
                if(num % i == 0) {
                    check = true; break;
                }
            }
            if(check == false) System.out.print(num + " ");
        }
    }
}