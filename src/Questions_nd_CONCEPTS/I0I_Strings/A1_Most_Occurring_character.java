package Questions_nd_CONCEPTS.I0I_Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A1_Most_Occurring_character {
    public static void main(String[] args) throws Exception {
        String str = "zhaaraas";

        System.out.println("Remove duplicates program:" );
        removeDuplicates(str);

        System.out.println("\nfind maximum frequency element: ");
        findElementWhoHasMaxFreq(str);
    }

    private static void removeDuplicates(String str) {
        int [] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // case : if the char's freq is equals 1 then only i'll print it
        String ans="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch - 'a'] == 1)
                ans += ch;
        }

        System.out.println(ans);
    }


    private static void findElementWhoHasMaxFreq(String str) {
        int []freq = new int[26];
        // here i'm using freq arr concept to find the most occuring element
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        System.out.println(Arrays.toString(freq));

        int max = 0; char store = ' ';
        for(int x=0; x<str.length(); x++) {
            char ch = str.charAt(x);
            if(freq[ch - 'a'] >= max ) {
                max = x; store = ch;
            }
        }
        System.out.println("max count of char is : " + " " + store);
    }
}



