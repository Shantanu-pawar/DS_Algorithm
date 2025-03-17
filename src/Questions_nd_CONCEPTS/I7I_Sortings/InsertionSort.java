package Questions_nd_CONCEPTS.I7I_Sortings;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int []arr = {44, 5, 11, 2, 32};
        insertion(arr);

    }
    static void insertion(int []arr){

        for(int i =1; i < arr.length; i++) {

            int val = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];  j--;
            }
            arr[j+1] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}
