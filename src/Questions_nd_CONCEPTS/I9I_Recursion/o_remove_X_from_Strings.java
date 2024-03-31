package Questions_nd_CONCEPTS.I9I_Recursion;

import java.util.Scanner;

public class o_remove_X_from_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(removeX(s));
    }

    static String removeX(String str){
        // case : if string is null
        if(str.length() == 0) return str;

        // case 1: if x is present then using substring pass from next char
        if(str.charAt(0) == 'x')
            return removeX(str.substring(1));
        else
            return str.charAt(0) + removeX(str.substring(1));
    }
}
