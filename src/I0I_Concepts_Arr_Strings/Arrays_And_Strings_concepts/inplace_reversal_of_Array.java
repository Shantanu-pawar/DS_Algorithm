package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class inplace_reversal_of_Array {
    public static void main(String[] args) {
        int []arr = {4, 2, 6, 1};
        int n = arr.length;
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
