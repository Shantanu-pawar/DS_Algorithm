package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class String_Manipulation_Functions {
    public static void main(String[] args) {

        String str = "";
        splitStringIntoArr(str);
        sortTheString(str);
        sortStringArr();
    }

    static void sortStringArr(){
        String str = "apple banana zebra";
        String [] ans1 = str.split(" "); // we're converting the string into arr

        System.out.println("String sorting before : " + Arrays.toString(ans1));

        Arrays.sort(ans1);
        System.out.println("String sorting after : " + Arrays.toString(ans1));
    }

    static void splitStringIntoArr(String str){
        str = "apple orange ban ana e ra";

        String[] words = str.split(" "); // split the words from string into arr format
        System.out.println(Arrays.toString(words));
    }

    static void sortTheString(String str){
        str = "zalkfjd";

        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("\n now return the sorted string");
        System.out.print(new String(arr));

    }
}
