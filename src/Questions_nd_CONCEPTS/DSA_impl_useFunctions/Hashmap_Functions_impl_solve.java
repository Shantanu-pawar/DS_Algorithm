package Questions_nd_CONCEPTS.DSA_impl_useFunctions;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_Functions_impl_solve {

    public static void main(String[] args) {
        int[] var10000 = new int[]{1, 2, 5, 5, 5, 1};
        String str = "Surrroad";
        printDuplicates(str);
    }

    public static void iteration(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] var2 = arr;
        int a = arr.length;

        for(int var4 = 0; var4 < a; ++var4) {
            int x = var2[var4];
            if (map.containsKey(x)) {
                map.put(x, (Integer)map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        System.out.println(map);
        Iterator var6 = map.entrySet().iterator();

        while(var6.hasNext()) {
            Map.Entry<Integer, Integer> e = (Map.Entry)var6.next();
            PrintStream var10000 = System.out;
            Object var10001 = e.getKey();
            var10000.println("the key is :" + var10001 + " :: and value is " + e.getValue());
        }

        System.out.print("\n Print all keys : ");
        var6 = map.keySet().iterator();

        while(var6.hasNext()) {
            a = (Integer)var6.next();
            if ((Integer)map.get(a) == 1) {
                System.out.print("" + a + " ");
            }
        }

        System.out.print("\n Print all values : ");
        var6 = map.values().iterator();

        while(var6.hasNext()) {
            a = (Integer)var6.next();
            System.out.print("" + a + " ");
        }

    }

    public static void printDuplicates(String str) {
        System.out.println("\n this is printing duplicate's characters from string : ");
        HashMap<Character, Integer> map = new HashMap();

        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            map.put(c, (Integer)map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}
