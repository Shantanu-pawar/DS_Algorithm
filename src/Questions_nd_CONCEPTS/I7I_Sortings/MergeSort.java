package Questions_nd_CONCEPTS.I7I_Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {6, 5, 12, 10, 9, 1};
        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int []arr, int start, int end){
        if (start < end){
            int mid =( start + end)/2;

            mergeSort(arr, start, mid); // basically calling itself till last elemnt
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end); //case : after recursive call's just merge it.
        }
    }

    static void merge(int []arr, int start, int mid, int end){
        int []ans = new int[end - start + 1];
        int i = start;
        int j = mid+1; int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j])
                ans[k++] = arr[i++];

            else
                ans[k++] = arr[j++];
        }
        // store the remaining elements
        while(i <= mid) ans[k++] = arr[i++];
        while(j <= end) ans[k++] = arr[j++];

        k = 0;
        // case: it's time to place this all into arr bcaz we actually print inplace at starting func
        for(int a =start; a<=end; a++) {
        arr[a] = ans[k++];
        }

    }
}
