package Questions_nd_CONCEPTS.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class String_Manipulation_Functions {
    public static void main(String[] args) {

        String str = "";
        sortTheString(str);
        splitStringIntoArr(str);
    }

    // split string into arr and sort it
    static void splitStringIntoArr(String str){
        str = "apple orange ban russian";

        String[] words = str.split(" "); // split the words from string into arr format
        System.out.println(Arrays.toString(words));

        System.out.println("\n Now let's try to sort this arr and return into String");
        Arrays.sort(words);

        System.out.println(Arrays.toString(words));
    }

    static void sortTheString(String str){
        System.out.println("\n words sorting logic");
        str = "zalkfjd";

        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("now return the sorted string :: " + new String(arr) + "\n");

    }
}
