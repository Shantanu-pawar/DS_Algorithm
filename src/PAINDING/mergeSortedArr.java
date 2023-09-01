package PAINDING;
/*  question :
constraints : M ,N > 0

sample input :
6
5
1 2 3 4 5 6
6 7 8 5 9

sample output : [1, 6, 2, 7, 3, 8, 4, 5, 5, 9, 6]

explanation :

from the sample input , given A1 of size is 6 and A2 of size is 5
the output is the combined array that has elements of the first array followed by elements of the second array
hence we got 1, 6, 2, 7, 3, 8, 4, 5, 5, 9  followed by the remaining element in the first array 6.
hence we get the output as [1, 6, 2, 7, 3, 8, 4, 5, 5, 9, 6]

 */
public class mergeSortedArr {
    public static void main(String args[]) {

        int []arr1 = {1, 4, 7, 3, 2};
        int n1 = arr1.length;

        int []arr2 = {2, 8, 2, 5, 9, 6};
        int n2 = arr2.length;

        int arr3[] = new int[n1+n2];
        alternateMerge(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i = 0; i < n1 + n2; i++)
            System.out.print( arr3[i] + " ");
    }
    static void alternateMerge(int arr1[], int arr2[],int n1, int n2, int arr3[]) {

        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];

    }
}
