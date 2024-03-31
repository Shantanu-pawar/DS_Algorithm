package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;

import java.util.HashMap;

public class MaximumFreqCharacter {
    public static void main(String[] args) {

        String str = "aabbbbccccd";
        char [] arr = str.toCharArray();

//        System.out.println( function(arr, arr.length););
        System.out.println(OptimisedFunction(arr, arr.length));
        System.out.println(usingFreqArrMethod(str));
    }

    static char usingFreqArrMethod(String s){
        int [] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq [ch - 'a']++;
        }

        // just traverse all alphabets
        char max = 'a';
        for(char c = 'a'; c <= 'z'; c++) {

            // this case will cover it's lexicographical order
            if(freq[c - 'a'] > freq[max - 'a'])
                max = c;
        }
        return max;
    }

    static char OptimisedFunction(char []arr, int n){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : arr){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' '; int maxFreq = 0;
        for(char ch: map.keySet()){

            if(map.get(ch) > maxFreq){
                maxChar = ch; maxFreq = map.get(ch);
            }

            // corner case if same element was present
            if(map.get(ch) == maxFreq && ch > maxChar) maxChar = ch;
        }
        return maxChar;
    }

    // naive approach
    static char function(char [] arr, int n){
        int max = 0;
        char ch = ' ', ans = ' ';

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    ch = arr[i];
                }
            }

            if(count > max) {
                max = count; ans = ch;
            }

        }
        System.out.println(max + " " + ans);
        return ans;
    }
}
