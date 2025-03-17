package Questions_nd_CONCEPTS.PAINDING.Strings.Concepts;

import java.util.*;

class convertStringIntoNo {
    public static void main(String[] args) {
        
        // concept : convert string number's into character number's.
        String st = "121233";

        int []arr = new int[st.length()];
        for(int i=0; i<st.length(); i++) {

            char ch = st.charAt(i);
            arr[i] = ch-'0';
        }
        for(int x : arr) System.out.print(x + " ");

        otherApproach();
    }

    static void otherApproach(){

        /*  approaches : there are two approaches that we can use :

            1. Using a naive approach via loops
            2. Using toChar() method of String class
        */

        //  method : convert Arr to string :: very helpful method

        char []ch = {'a', 'd', 'e', 'd', 'q'};
        System.out.println(new String(ch));

        // approach 1:
        String str = "hello world";
        char []arr = new char[str.length()];

        for(int i=0; i<str.length() ; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.print(Arrays.toString(arr));

        // approach 2:
        System.out.print("\n another approach \n");
        String st = "this is new one";

        char []cha = st.toCharArray();
        for(char a : cha) System.out.print(a + " ");
    }
}

