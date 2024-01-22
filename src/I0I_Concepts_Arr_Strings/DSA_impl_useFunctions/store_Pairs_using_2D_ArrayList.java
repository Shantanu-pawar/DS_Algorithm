package I0I_Concepts_Arr_Strings.DSA_impl_useFunctions;

import java.util.ArrayList;
import java.util.List;

public class store_Pairs_using_2D_ArrayList {
    public static void main(String[] args) {
        int[] array = {4, 12, 5, 1, 3, 3};
        int sum = 6;

        List<List<Integer>> pairsList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] == sum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(array[i]);
                    pair.add(array[j]);
                    pairsList.add(pair);
                }
            }
        }

        // Print the pairs
        for (List<Integer> pair : pairsList) {
            System.out.println("Pair: " + pair.get(0) + ", " + pair.get(1));
        }
    }
}
