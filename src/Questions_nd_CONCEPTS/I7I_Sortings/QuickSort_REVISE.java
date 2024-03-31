package Questions_nd_CONCEPTS.I7I_Sortings;


/*
Advantages of Quick Sort:
It is a divide-and-conquer algorithm that makes it easier to solve problems.
It is efficient on large data sets.
It has a low overhead, as it only requires a small amount of memory to function.

Disadvantages of Quick Sort:
It has a worst-case time complexity of O(N2), which occurs when the pivot is chosen poorly.
It is not a good choice for small data sets.
 */


//GFG Ques link : https://practice.geeksforgeeks.org/problems/quick-sort/1

import java.util.Arrays;
public class QuickSort_REVISE {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pIndex = low;

        for (int i = low; i < high ; i++) {
            if(arr[i] <= pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }

        swap(arr, pIndex, high);
        return pIndex;
    }

    static void quickSort(int[] arr, int low, int high){

        if (low < high) { // pi = Pindex [partition index]
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
