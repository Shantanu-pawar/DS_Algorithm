package I0I_Concepts_Must_Know;

import java.util.Arrays;

public class Arr_Element_Copy {
    public static void main(String[] args) {

//        copy element's from one arr to another arr
        int []arr = {1, 2, 3, 4, 5, 6};
        int []copy = arr;


        arr[5] = 100;  // lession : after updating the arr value we can still access the updated arr.

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
    }
}
