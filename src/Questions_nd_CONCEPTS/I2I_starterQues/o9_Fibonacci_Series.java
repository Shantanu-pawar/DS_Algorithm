package Questions_nd_CONCEPTS.I2I_starterQues;

public class o9_Fibonacci_Series {
    public static void main(String[] args) {

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
