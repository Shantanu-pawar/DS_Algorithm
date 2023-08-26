package I2I_starterQues;

public class o3_FactorialNumber {
    public static void main(String[] args) {

        int no = 4;
        int ans = 1;
        for (int i = 1; i <= no; i++) {
            ans = ans * i;
        }

        System.out.println(ans);
    }
}
