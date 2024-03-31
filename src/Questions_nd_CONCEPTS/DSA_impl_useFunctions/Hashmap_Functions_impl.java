package Questions_nd_CONCEPTS.DSA_impl_useFunctions;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_Functions_impl {
    public static void main(String[] args) {
// Question : hashmap functions handling

        String str = "manipullation";
//        printDuplicateChars(str);

        int []arr = {23,34,23,23,23,12};
        printDuplicateIntegers(arr);
    }

    static void printDuplicateIntegers(int []arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // this will check the values of the key and update it
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

//        print Using entrySet
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println("the key is :" + e.getKey() +
                    " :: and value is " + e.getValue());
        }

//        Another way to print
        for (int a : map.keySet())
            if(map.get(a) == 1)
                System.out.print(a + " : is the key and the value is : " + map.get(a));


        // here we're finding maximum element's freq
        int  value = 0, freq = 0;
        for(int ans : map.keySet()){
            if(map.get(ans) > freq){
                freq = map.get(ans); value = ans;
            }
        }
        System.out.println(value + " is the value and freq is : " + freq);
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