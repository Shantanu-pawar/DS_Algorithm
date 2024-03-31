package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;

import java.util.Arrays;
import java.util.HashMap;

public class print_all_single_NonRepeatative_chars_fromString {
    public static void main(String[] args) {
        String str = "aabcee"; // print all non repetative chars
        usingHashmap(str);
        usingFreqArr(str);

//      in case of arr we can also use freq arr concept
        int [] arr  = {2, 6, 4, 2}; // output " 6 4 "
        forArr(arr);
    }

    static void forArr(int []arr){
        int []freq = new int[1000];
        for (int i = 0; i < arr.length; i++)
            freq[arr[i]]++;

        System.out.println("\n");
        // now check all single elements
        for (int i = 0; i < arr.length; i++) {
            if(freq[arr[i]] == 1)
                System.out.print(arr[i] + " ");
        }
    }
    static void usingFreqArr(String str){
        int []freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        System.out.println("\n \n here's the freq arr of all string chars");
        System.out.println(Arrays.toString(freq));

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if(freq[ch - 'a'] == 1)
                System.out.print(ch);
        }

    }
    static void usingHashmap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);

            else map.put(ch, 1);
        }

        // we can also use map.get(a) = to get character's frequency
        for(Character x : map.keySet()){
            if(map.get(x) == 1)
                System.out.print(x);
        }
    }
}
