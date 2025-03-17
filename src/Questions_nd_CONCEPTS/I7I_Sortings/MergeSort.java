package Questions_nd_CONCEPTS.I7I_Sortings;
import java.util.Arrays;



public class MergeSort {
    public static void main(String[] args) {

        int []arr = {21,12,5,66,34};
        mergesort(0, arr.length-1, arr);

        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int start, int end, int []arr){

        if(start < end){
            int mid = (start+end)/2;
            mergesort(start, mid, arr);
            mergesort(mid+1, end, arr);

            calculateAndMergeArr(start, mid, end, arr);
        }
    }

    static void calculateAndMergeArr(int start, int mid, int end, int []arr){
        // create arr size
        int []temp = new int[end-start+1];
        int i = start; int j = mid+1;
        int k = 0;

        // fill the arr accordingly to the order
        while(i<=mid && j<=end) {

            // compare the elements
            if(arr[i] < arr[j])
                temp[k++] = arr[i++];

            else temp[k++] = arr[j++];
        }

        // filled the remaining arr elements case
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= end) temp[k++] = arr[j++];

        // replace you're temp arr into above one which you wanna return
        k = 0;
        for(int a = start; a <= end; a++){
            arr[a] = temp[k++];
        }
    }

}
