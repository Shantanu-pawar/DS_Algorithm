package Questions_nd_CONCEPTS.I9I_Recursion;

public class o1_factorial_of_number {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }
}
