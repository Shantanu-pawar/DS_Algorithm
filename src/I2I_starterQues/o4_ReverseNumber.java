package I2I_starterQues;

public class o4_ReverseNumber {
    public static void main(String[] args) {

        int n = 2323;
        int newNo = 0;
        int rem = 0;

        while(n != 0) {
            rem = n % 10; // take last digit
            n = n / 10; // cut last no
            newNo = newNo * 10 + rem; // add into new no.
        }
        System.out.println(newNo);
    }
}
