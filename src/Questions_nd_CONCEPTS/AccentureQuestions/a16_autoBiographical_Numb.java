/*
Problem Statement:
Given an integer 'n', check if it is an autobiographical number or not, if it is,
then return the count of distinct numbers in n, and if it isn't an auto
biographical number, then return 0.

An autobiographical number is where the first digit represents the count of zeroes
in the number, the second digit represents the count of ones in the number, and so on.

explanation : https://youtu.be/aH4aTZZg0ik?t=62
*/

package Questions_nd_CONCEPTS.AccentureQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class a16_autoBiographical_Numb {
    public static void main(String[] args) {
        System.out.println(check("3211000"));
        //1210 - 2020, 3211000 :: no's are auto
        // 11, 123 [not auto]
        // note : if the no is autobiographical then return the sum or return 0


//        gfg : https://www.geeksforgeeks.org/find-all-autobiographical-numbers-with-given-number-of-digits/
    }

//    time and space complexity : O(n)
    static int check(String str){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i)-'0';
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // filling the indexing occurrences in our map
            if(!map.containsKey(i)) map.put(i, 0);
        }

        System.out.println(map);
        // now we'll calculate the sum : by storing unique freq's in set
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int x: map.keySet()){
            int key = map.get(x);
            if(!set.contains(key)) {
                set.add(key);
                sum += key;
            }
        }

        boolean check = true;
        for (int i = 0; i < str.length(); i++) {

            int ch =  str.charAt(i)-'0';
            if(map.containsKey(i)){
    // 1210 - checking here if my index start from 0 has it's string index freq or not
                if(map.get(i) != ch) check = false;
            }
        }
        if (check) return sum;
        else return 0;
    }
}
