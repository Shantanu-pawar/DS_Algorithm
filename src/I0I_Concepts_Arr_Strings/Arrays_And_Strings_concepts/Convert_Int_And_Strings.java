package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class Convert_Int_And_Strings {
    public static void main(String[] args) {
        Functions.convertStringIntoArr();
    }
}

class Functions{
    static void convertStringIntoArr() { // concept : convert string number's into character number's.
        String st = "121233";
        int[] arr = new int[st.length()];

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            arr[i] = ch - '0'; // it converts char to int
        }
        System.out.println(Arrays.toString(arr));
    }

    static void int_To_String(){
        int n = 23245;
        String s = Integer.toString(n);
        System.out.println(s + " :: is the conversion of int-string");
    }

    static void String_To_int(){
        String str = "323435";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }

    static void compareTwoStrings(){
    // in this we convert and check which string is greater
        String s = "11232";
        String ss = "234";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(ss);

        if(a < b) System.out.println(b);
        else System.out.println(a);
    }

    static void convert(){ // this is or method to convert integers to string
        int ab = 11111111;
        String ans = String.valueOf(ab);
        System.out.println(ans);

    }
}