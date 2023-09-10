package I5I_HashMaps_Sets;

import java.util.Arrays;
import java.util.HashMap;

public class find_char_present_inString {
    public static void main(String[] args) {
        String str = "leetcode";
        char ch = 'e';

        usingHashmap(str, ch);
        usingFreqArr(str, ch);
    }
    static void usingFreqArr(String str, char ch){
        int []freq = new int[26];
        boolean check = false;
        
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(x == ch) check = true;
            freq[x - 'a']++;
        }
        System.out.println(Arrays.toString(freq));

        if(check == true)
            System.out.println(freq[ch - 'a']);

        else System.out.println("your element is not present in FreqArr");

    }

    static void usingHashmap(String str, char ch){
        HashMap<Character, Integer>map = new HashMap<>();
        boolean flag = false;

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);

            if(map.containsKey(x))
                map.put(x, map.get(x)+1);

            else map.put(x, 1);
        }

        for(Character x : map.keySet()){
            if(x == ch) flag = true;
        }

        if(flag == true){
            System.out.println("Character is present in String with freq : " + map.get(ch));
        } else
            System.out.println("element not present.");
    }
}
