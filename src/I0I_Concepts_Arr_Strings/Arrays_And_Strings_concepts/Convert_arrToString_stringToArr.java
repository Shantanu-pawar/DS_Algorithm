package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

/*  approaches : there are two approaches that we can use :
    1. Using a naive approach via loops
    2. Using toChar() method of String class */

public class Convert_arrToString_stringToArr {
    public static void main(String[] args) {

//      method : convert Arr to string :: very helpful method
        char []ch = {'a', 'd', 'e', 'd', 'q'};
        System.out.println(new String(ch));

        // approach 1: convert string into character Arr
        String str = "hello world";

        char []arr = new char[str.length()]; // initialise the char arr
        for(int i=0; i<str.length() ; i++)
            arr[i] = str.charAt(i);

        System.out.print(Arrays.toString(arr));


        // approach 2:
        System.out.print("\n another approach \n");

        String st = "this is new one";
        char [] cArr = st.toCharArray();
        for(char a : cArr) System.out.print(a + " ");
    }
}

