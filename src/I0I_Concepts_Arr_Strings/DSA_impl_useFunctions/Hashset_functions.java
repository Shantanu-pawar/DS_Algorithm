package I0I_Concepts_Arr_Strings.DSA_impl_useFunctions;

import java.util.HashSet;

public class Hashset_functions {
    public static void main(String[] args) {

        int []arr = {1, 2, 2, 8, 7};

        HashSet<Integer> set = new HashSet();
        // add element's in hashset
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Methods to print Hashset
        System.out.println(set);
        for(int x : set) System.out.print(x + " ");

    }
}
