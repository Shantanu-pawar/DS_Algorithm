package Questions_nd_CONCEPTS.I9I_Recursion;

public class o5_reverse_a_Number {
    public static void main(String[] args) {
        int number = 10023;
        int n  = number;
        System.out.println(reverse(n));
    }

    static int ans = 0;
    static int reverse(int n){
        if( n == 0) return ans;

        int rev = n % 10;
        ans = (ans * 10) + rev;

        return reverse(n/10);
    }
}
