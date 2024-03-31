package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;

/* Approach : it return the value of character's
              ex : 'a'-'a' = 0;
                   'b'-'a' = 1;
here we're mapping every character to it's index and then store its value in the arr */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class most_occurring_char_inString {
    public static void main(String[] args) {
        String str = "abcazbbbzzz";
        int n = str.length();
        usingHashmap(str, n);
    }

    static void usingHashmap(String str, int n){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if( map.containsKey(ch) ) map.put(ch, map.get(ch) + 1);
            else  map.put(ch, 1);
        }

        // case : now here we're traversing and finding maxi repeat
        int max = 0;
        String ans = "";
        for(Character ch : map.keySet()) {
            if(max < map.get(ch) )
                max = map.get(ch); // find max char out of stored chars
        }

        // this condition satisfies what if two chars have same max repetitions.
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == max)
                ans += entry.getKey();
        }

        System.out.println(ans);

        System.out.println("Conversion of String into character arr : ");
        char []ar = new char[4];
        ar = ans.toCharArray();
        System.out.println(Arrays.toString(ar));
    }

    static void usingArr(String str, int n){
        int [] freq = new int[26];  // case 1: first we have to convert the string into arr for return in last

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++; // we just increased freq at particular index of char
        }
        System.out.println(Arrays.toString(freq));

        int max = 0;
        char ans = ' ';
        for(int i=0; i<n ;i++) { // now just find max and return that element from String
            char ch = str.charAt(i);

            if(freq[ch - 'a'] >= max) {
                ans = ch;
                max = freq[ch-'a'];
            }
        }
        System.out.println(max + " and the character is : " + ans);
    }
}
