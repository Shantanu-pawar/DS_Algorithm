package Questions_nd_CONCEPTS.Arr_String_Ques;

import java.util.HashMap;
import java.util.stream.Stream;

public class check_ifStringContainsOrNot {
    public static void main(String[] args) {


//      Question : check if my all elements chars is present in the given string (str) or not?
        String  str = "contains";
        String element = "tai";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < element.length(); i++) {
            char ch = element.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
            }
        }

        boolean check = true;
        for(char ch : map.keySet()){
            if(map.get(ch) > 0){
                check = false;
            }
        }

        if (check == false) System.out.println("elements are not present completely.");
        else System.out.println("yes all elements contains it.");
    }
}
