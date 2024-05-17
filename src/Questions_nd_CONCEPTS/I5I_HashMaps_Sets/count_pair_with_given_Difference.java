package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class count_pair_with_given_Difference {
    public static void main(String[] args) {

     /* find the pairs who's sum is equals to target
     [here's i've managed the cornerCase also - what if multiple same elements occurs]

     INTERESTING CONCEPT
     */

        int[] arr = {15, 0, 4, 4, 0, 12};
        int target = 4;

        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int diff = target - x;

            if (map.containsKey(diff)) {
                List<Integer> indices = map.get(diff);
                for (int index : indices) {
                    List<Integer> sublist = new ArrayList<>();
                    sublist.add(index);
                    sublist.add(i);
                    list.add(sublist);
                }
            }

            // Update the map
            if (!map.containsKey(x)) {
                map.put(x, new ArrayList<>());
            }
            map.get(x).add(i);
        }

        System.out.println(list);
    }
}
