package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class Inplace_Reversals {
    public static void main(String[] args) {
        int []arr = {4, 2, 6, 1};
        int n = arr.length;
        inplaceArray.reverse(arr, n);
        inplaceString.reverse("heyy dad i bought new mustang");
    }
}

class inplaceArray{
    public static void reverse(int []arr, int n){
        System.out.println(Arrays.toString(arr));
        /*
         * this is optimised inplace reversal of arr
         * TC : log N and no extra space
         * */

        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

class inplaceString {
    static String reverse(String str) {
        // check baseCase
        if(str.length() == 0 ) return str;

        // case1 : convert string into char arr
        char[] ch = str.toCharArray();

        int i = 0;  int j = ch.length - 1;

        while (i < j) {
            swap(ch, i, j);
            i++; j--;
        }
        return new String(ch);
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
