package I7I_Sortings;


/*
Advantages of Quick Sort:
It is a divide-and-conquer algorithm that makes it easier to solve problems.
It is efficient on large data sets.
It has a low overhead, as it only requires a small amount of memory to function.

Disadvantages of Quick Sort:
It has a worst-case time complexity of O(N2), which occurs when the pivot is chosen poorly.
It is not a good choice for small data sets.
 */

import java.util.Arrays;

public class QuickSort_REVISE {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
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
