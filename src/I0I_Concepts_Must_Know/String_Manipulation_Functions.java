package I0I_Concepts_Must_Know;

import java.util.Arrays;
import java.util.Scanner;

public class String_Manipulation_Functions {
    public static void main(String[] args) {

        convertStringIntoArr("zalkfjd");
        splitStringIntoArr("apple orange ban ana e ra");
        sortStringInput();
    }
    static void sortStringInput(){
        System.out.println("enter the string INPUT");
        // 2. sort the string
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        String []ans1 = new String[n];

        for(int i=0; i<n; i++)
            ans1[i] = in.next();

        Arrays.sort(ans1);
        System.out.println(Arrays.toString(ans1));
    }

    static void splitStringIntoArr(String str){
//        split the words from string into arr format
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
    }

    static void convertStringIntoArr(String str){
//        split character's from string and sort into string
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
