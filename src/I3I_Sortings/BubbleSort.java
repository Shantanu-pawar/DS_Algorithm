package I3I_Sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {4, 5, 11, 2, 32};
        
        bubbleSort(arr);
    }
    static void bubbleSort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
