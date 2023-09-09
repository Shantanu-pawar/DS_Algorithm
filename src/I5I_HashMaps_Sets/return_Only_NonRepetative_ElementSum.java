package I5I_HashMaps_Sets;

import java.util.HashMap;
import java.util.Map;

//    Find sum of non-repeating (distinct) elements in an array Given an integer
//    array with repeated elements, the task is to find sum of all distinct elements in array.

//    Input  : arr[] = {12, 10, 9, 45, 2, 10, 10, 45,10};
//    Output : 78
//    Here we take 12, 10, 9, 45, 2 for sum :: because it is distinct element
//
//    Input : arr[] = {1, 10, 9, 4, 2, 10, 10, 45 , 4};
//    Output : 71

public class return_Only_NonRepetative_ElementSum {
    public static void main(String[] args) {
        int []arr = {1, 10, 9, 4, 2, 10, 10, 45 , 4};
        int n = arr.length;
        System.out.println(findSum(arr, n));
    }

    /*there is one more approach:
    * sort the arr using function, and then check if arr[i] != arr[i+1] then add the sum  TC = (N log n)*/

    public static int findSum(int []arr, int n){ // TC : O(N) SPACE : O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)) map.put(i, 1);

            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int sum = 0;
        for(int x : map.keySet()) sum += x;

        return sum;
    }
}
