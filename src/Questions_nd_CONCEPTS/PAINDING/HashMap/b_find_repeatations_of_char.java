package Questions_nd_CONCEPTS.PAINDING.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class b_find_repeatations_of_char {

    public static void main(String[] args) {
        usingHashMap();
        usingFreqArr();
    }

    static void usingFreqArr() {

        // Approach : using freqency arr
        String st = "leetcode";
        int freq[] = new int[26];
        char target = 'e';

        for(int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);
            freq[ch - 'a']++;
        }

        boolean check = false;
        for(int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if(ch == target)  {
                check = true; break;
            }
        }
        System.out.println(Arrays.toString(freq));

        if(check == true )
            System.out.println(freq[target - 'a']);

        else System.out.println("your element is not present in FreqArr");

    }


    static void usingHashMap () {
// 		ques : just find if element is present or not
// 		if present then just print the repetations of number

        String str = "asffas";
        char ch = 'f';

        HashMap <Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        boolean check = false;
        for(Character a : map.keySet() ) {

            if(a == ch) {
                System.out.print("yess element is present :" + map.get(a));
                check = true;
                break;
            }
        }
        if(check == false)
            System.out.print("element not present");
    }
}
