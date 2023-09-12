package I5I_HashMaps_Sets;

import java.util.HashMap;
import java.util.Map;

//https://course.acciojob.com/idle?question=ac357ab6-b52a-4e37-ae2e-7afac866afb7
/*
acciojob
4 5 6 7 0 2 1 3
Output: oojbacci

 */
public class shuffle_String {
    public static void main(String[] args) {
        String str = "acciojob";
        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};
        usingHashmap(str, arr);

        System.out.println("\n");
        usingArrConcept(str, arr);
    }

    static void usingArrConcept(String str, int []arr){
        char []charArr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int index = arr[i];
            char ch = str.charAt(i);

            // here we filled ch to it's proper index in char arr.
            charArr[index] = ch;
        }

        // return charArr here lastly
        String result = new String(charArr);
        System.out.println(result);
    }

    static void usingHashmap(String str, int []arr){
        HashMap <Integer, Character> map = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            map.put(arr[i], ch);
        }

        // note : entry.getKey() - print's all arr in sorted format
        //       entry.getValue() = print all character's from hashmap

        // entry set print's all indexes in sorted manner
        for (Map.Entry<Integer, Character> entry : map.entrySet())
            System.out.print(entry.getValue());

    }
}
