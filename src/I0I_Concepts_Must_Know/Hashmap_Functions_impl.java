package I0I_Concepts_Must_Know;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Functions_impl {
    public static void main(String[] args) {
        int []arr= {1, 2, 5, 5, 5, 1};
        iteration(arr);
    }

    public static void iteration(int []arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Approach 1:
        for(int x: arr) {
            if(map.containsKey(x)) map.put(x, map.get(x) + 1);

            else map.put(x, 1);
        }

        System.out.println(map);
//        print Using entrySet
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println("the key is :"+ e.getKey() + " :: and value is "+ e.getValue());
        }

//        Another way to print
        System.out.println("Print all keys : ");
        for(int a : map.keySet())
            System.out.print(a + " ");

        System.out.println("\n Print all values : ");
        for(int a: map.values())
            System.out.print(a + " ");

    }
}
