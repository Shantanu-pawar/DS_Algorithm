package Questions_nd_CONCEPTS.I2I_starterQues;

public class o12_Armstrong_Number {
    public static void main(String[] args) {

//         // Check if particular number is armstrong
//        if(isArmstrong(233) == true)
//            System.out.println("this number is armstrong number");
//        else
//            System.out.println("not an armstrong number.");


//        print all armstrong number's from 100 to 1000
        for (int i = 100; i <= 1000 ; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
    }
    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int digit = 0;
        while (temp > 0) {
            digit = temp % 10;
            sum += (digit*digit*digit);
            temp = temp / 10; // remove last digit
        }

        if(sum == n) return true;
        else return false;
    }
}
