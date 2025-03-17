package Questions_nd_CONCEPTS.I7I_Sortings;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr = {4, 5, 11, 2, 32};

        selection(arr);
    }

    static void selection(int []arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) { // for ascending sorting
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}

