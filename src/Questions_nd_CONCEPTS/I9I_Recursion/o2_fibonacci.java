package Questions_nd_CONCEPTS.I9I_Recursion;

public class o2_fibonacci {
    public static void main(String[] args) {

        int n = 9;
        int ans = fibonacci(n);
        System.out.println(ans);
    }
    static int fibonacci(int n){

        // base cases of fibo
        if(n == 1) return 0;
        if(n == 2) return 1;

        // simply iterating the fun and adding the output
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
