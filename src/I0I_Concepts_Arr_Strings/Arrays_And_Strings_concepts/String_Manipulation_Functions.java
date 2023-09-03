package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Arrays;

public class String_Manipulation_Functions {
    public static void main(String[] args) {

        String str = "";
        convertStringIntoArr(str);
        splitStringIntoArr(str);
        sortStringInput();
    }
    static void sortStringInput(){
        String []ans1 = {"dadu, ram, aakka"};
        System.out.println("String sorting before : " + Arrays.toString(ans1));

        Arrays.sort(ans1);
        System.out.println("String sorting after : " + Arrays.toString(ans1));
    }

    static void splitStringIntoArr(String str){
        str = "apple orange ban ana e ra";
//        split the words from string into arr format
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
    }

    static void convertStringIntoArr(String str){
        str = "zalkfjd";
//        split character's from string and sort into string
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
