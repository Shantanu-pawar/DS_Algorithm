package Arr_String_Ques;
/*  question :
constraints : M ,N > 0

sample input :
4
2
1 2 3 4
6 7

sample output : [1, 6, 2, 7, 3, 4,]

explanation :

from the sample input , given A1 of size is 6 and A2 of size is 5
the output is the combined array that has elements of the first array followed by elements of the second array
hence we got 1, 6, 2, 7, 3, 8, 4, 5, 5, 9  followed by the remaining element in the first array 6.
hence we get the output as [1, 6, 2, 7, 3, 8, 4, 5, 5, 9, 6]

 */
import java.util.Arrays;

public class Q_merge_sorted_arr {
    public static void main(String[] args) {
        int []arr1 = {1, 4, 7, 3, 2};
        int n1 = arr1.length;

        int []arr2 = {2, 8, 2, 5, 9, 6};
        int n2 = arr2.length;

        int[] ans = new int[n1+n2]; // first created new answer arr and passed into fun.
        alternateMerge(arr1, arr2, n1, n2, ans);
    }

    static void alternateMerge(int []arr1, int []arr2, int n, int m, int []ans){

        int k = 0;
        int i = 0; int j = 0;
        while(i < n  && j < m) {

            if(arr1[i] > arr2[j]){
                ans[k++] = arr1[i++];
            }
            else ans[k++] = arr2[j++];
        }

        while(i < n) ans[k++] = arr1[i++];
        while(j < m) ans[k++] = arr2[j++];

        System.out.println(Arrays.toString(ans));
    }
}
