
import java.util.*;

// use frequency array approach 

class Main{
    public static void main(String []args) {
        Scanner in = new  Scanner(System.in);
        String s = in.next();
        
      // case1 : storing the freq in arr
        int [] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            freq [ch - 'a']++;
        }
        
      
        // just traverse all alphabets 
        char max = 'a';
        for(char c='a' ; c<= 'z'; c++) {
            
            // this case will cover it's lexographical order
            if(freq[c-'a'] > freq[max - 'a'])
                max = c;
        }
        
        System.out.println(max);
 	}
}


//
//// hashmap approach
//
//import java.util.*;
//class Main{
//    public static void main(String []args) {
//        Scanner in = new  Scanner(System.in);
//        String s = in.next();
//
//		char ans = find(s);
//		System.out.println(ans);
//    }
//
//	public static Character find(String s) {
//	 if(s.length() == 1) return s.charAt(0);
//        Map<Character, Integer> freq = new HashMap<>();
//		// map to store frequency of each alphabet
//
//        for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//            freq.put(c, freq.getOrDefault(c, 0) + 1);
//        }
//
//        char maxChar = '1';
//		int maxFreq=0;
//        for (char c : freq.keySet()) {
//            if (freq.get(c) > maxFreq){
//                maxChar = c;
//				maxFreq = freq.get(c);
//			}
//            if (freq.get(c) == maxFreq && c < maxChar)
//                maxChar = c;
//        }
//
//        return maxChar;
//    }
//}
//
