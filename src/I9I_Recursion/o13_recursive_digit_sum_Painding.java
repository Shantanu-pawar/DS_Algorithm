package I9I_Recursion;

import java.util.Scanner;

//https://course.acciojob.com/idle?question=be2b14d5-8ea8-4bc3-ab30-aa37c458f18d
public class o13_recursive_digit_sum_Painding {
    static int SuperDigit(String st) {

        if(st.length() == 1)
            // just converted here string to integer format
            return Integer.parseInt(st);

        int sum = 0;
        for(int i=0; i< st.length(); i++) {
            char ch = st.charAt(i);
            sum += (ch-'0');
            // this ch-0 is just for convert string to integer
            // logic : suppose asci value of 1 is 33
            // 							 and 0 is 32
            // 					so remainder is also 1 right
        }

        String finalise = Integer.toString(sum);
        return SuperDigit(finalise);
    }

    public static void main(String [] args) {

        Scanner in  =  new Scanner (System.in);
        String st = in.next();
        int k =  in.nextInt();
        String str = "";

        for(int i=0; i< k ;i++ ) str += st;

        System.out.println(SuperDigit(str));
    }
}