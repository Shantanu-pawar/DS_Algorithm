import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) throws Throwable {

        String str = "abcabb";
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            if( map.containsKey(ch) ) map.put(ch, map.get(ch) + 1);
            else  map.put(ch, 1);
        }

// case : now just traverse all unique char and check whose occurance is more        
        int max = 0; 
        char ans = ' ';
        for(Character ch : map.keySet()) { //it represent's all the set that we stored in HashMap
            if(max < map.get(ch) ) {
                ans = ch; // store char
                max = map.get(ch); // store repeatations no
            }
        }
        
        System.out.println("most repeated char is : " + ans + "\n and nos of repeatations is : " + max);
    }
}



// Approach : using freqency map 

class Main {
    public static void main(String []args ) {
        String s = "aaabbbzz"; 
        // HashMap<Character, Integer> map = new HashMap <>();
        
        int []freq = new int[26];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        
        System.out.println(Arrays.toString(freq));
        
        int max = 0;
        char ans = ' ';
        for(int i=0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(freq[ch - 'a'] >= max) {
                ans = ch;
                max = freq[ch - 'a'];
            }
        }
        
        System.out.print(ans);
    }
}


