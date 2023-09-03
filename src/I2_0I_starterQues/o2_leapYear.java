package I2_0I_starterQues;

import java.util.Scanner;

public class o2_leapYear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your year : ");
        int year = in.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " Is prime year");

        else
            System.out.println(" Not a prime year");
    }
}
