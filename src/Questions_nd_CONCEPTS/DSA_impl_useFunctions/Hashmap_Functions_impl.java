package Questions_nd_CONCEPTS.DSA_impl_useFunctions;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Functions_impl {
    public static void main(String[] args) {
// Question : hashmap functions handling

        String str = "manipullation";
//        printDuplicateChars(str);

        int []arr = {23,34,23,23,23,12};
        IterateHashMap(arr);
    }

    static void IterateHashMap(int []arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // this will check the values of the key and update it
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);


//        print Using entrySet
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println("key:" + entry.getKey() +" value: " + entry.getValue());

//        Another way to print
        for (int a : map.keySet())
            System.out.println(a + " : is the key and the value is : " + map.get(a));

    }


    static void printDuplicateChars(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(map.containsKey(ch))
                map.put(ch, (map.get(ch)+1));

            else map.put(ch, 1);
        }

        for(char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " " + map.get(ch));
            }
        }

    }
}