package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;

/*https://course.acciojob.com/idle?question=803b4abc-3829-4b3b-9dab-74da720ff06a
we have given a pair and k value
so we just have to find the pairs wo give us the difference of k
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class count_pair_with_given_Difference {
    public static void main(String[] args) {
        int []arr = {5 ,10 ,3 ,2 ,50 ,80};
        int k = 78;

        findDiff(arr, k);

    }
    static void findDiff(int []arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        List<List<Integer>> list = new ArrayList<>(); // storing all the pairs

        // INTERESTING CONCEPT : how to use arraylist for storing pairs
        for(int num : arr) {
            int diff = k + num;
            if(map.containsKey(num)) {
                count++;
                List<Integer> pair = new ArrayList<>();
                pair.add(num - k);
                pair.add(num);

                list.add(pair);

                // we're putting diff here cause then in future we should know that the num is present in map
                map.put(num, map.get(num) + 1);
            }
            else map.put(diff, map.getOrDefault(diff, 0) +1);

        }
        System.out.println(count);

        // Now here printing that 2D ArrayList
        for(List<Integer> p : list)
            System.out.println(p.get(0) + " " + p.get(1));
    }
}
