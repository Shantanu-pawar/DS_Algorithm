package I0I_Concepts_Arr_Strings.Painding_StringbuilderConcepts;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokeniser_Concept {
    public static void main(String[] args) {

//        reverse();
        usingTokeniser();

    }
    static void usingTokeniser(){

        String s = "dady has strings";
        StringTokenizer str = new StringTokenizer(s);

        // step 2 : each time store tokens into StringBuffer and reverse it
        while (str.hasMoreTokens()) {
            String ans = str.nextToken();

            // reverse and print each words as tokens
            StringBuffer token = new StringBuffer(ans);
            token.reverse();
            System.out.print(token.toString() + " ");
        }
    }

    static void reverse(){
        String str = "dady has strings";
        String []arr = str.split(" ");

        System.out.println(Arrays.toString(arr));
        for(int i=0; i< arr.length; i++) {
            String word = arr[i];

            String rev = helper(word);
            arr[i] = rev;
        }
        System.out.println(Arrays.toString(arr));
    }

    static String helper(String str){ // i'm reversing the arr words using helper function.
        String ans = "";
        for (int i = str.length()-1; i>= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}


