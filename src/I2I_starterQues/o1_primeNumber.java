package I2I_starterQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class o1_primeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("enter your number: ");
        int input = in.nextInt();
        for(int n = 1; n <= input; n++) {
            prime(n);
        }

        // check if the number is prime?
        System.out.println(isPrime(7));

    }

//    print prime numbers 1 to 100
    static void prime(int n){

        int flag = 0;
        for(int i=2; i<n; i++) {
            if(n % i == 0) flag += 1;
        }

        if(flag == 0) System.out.print(n + " ");
    }

    static String isPrime(int n){
        boolean flag = true;

        for (int i = 2; i < n-1; i++) {
            if(n % i == 0) {
               flag = false;
            }
        }

        if(flag == true) {
            return "\n it's prime numb";
        }else return "\n Not prime number";
    }

}
