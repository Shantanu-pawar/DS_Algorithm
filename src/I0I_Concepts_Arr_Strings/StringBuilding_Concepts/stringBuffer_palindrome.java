package I0I_Concepts_Arr_Strings.StringBuilding_Concepts;

import java.util.Scanner;

public class stringBuffer_palindrome {
    public static void main(String[] args) {

     /* StringBuffer methods
        1. append() = str.append("fruit");
        2. insert()
        3. reverse() - for reversing the string
        4. toString() - for printing
      question : palindrome using buffer String      */

        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        StringBuffer b = new StringBuffer(a);
        b.reverse(); // this gives yor reverse String
        String c = b.toString();

        if (a.equalsIgnoreCase(c) == true) System.out.println("palindrome");

        else System.out.println("not palindrome String ");
    }
}

