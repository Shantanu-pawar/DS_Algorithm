package I0I_Concepts_Arr_Strings.DSA_impl_useFunctions;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Functions_impl {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 5, 1};
        iteration(arr);

        String str = "Surrender on road";
        printDuplicates(str);
    }

    public static void iteration(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Approach 1:
        for (int x : arr) {
            if (map.containsKey(x)) map.put(x, map.get(x) + 1);

            else map.put(x, 1);
        }

        System.out.println(map);
//        print Using entrySet
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println("the key is :" + e.getKey() + " :: and value is " + e.getValue());
        }

//        Another way to print
        System.out.print("\n Print all keys : ");
        for (int a : map.keySet())
            System.out.print(a + " ");

        System.out.print("\n Print all values : ");
        for (int a : map.values())
            System.out.print(a + " ");
    }

    public static void printDuplicates(String str) {

        System.out.println("\n this is printing duplicate's characters from string : ");
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        System.out.println(map);
    }
}