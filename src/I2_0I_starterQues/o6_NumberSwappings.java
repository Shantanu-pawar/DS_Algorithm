package I2_0I_starterQues;

public class o6_NumberSwappings {
    public static void main(String[] args) {
        int a = 23;
        int b = 2;

        System.out.println(swap(a, b));
        System.out.println(swapWithoutTemp(a, b));
    }

    static String swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        return "the a is : " + a + " and b is : " + b;
    }

//    this swapping is with using formulae
    static String swapWithoutTemp(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        return "the a is : " + a + " and b is : " + b;
    }
}
