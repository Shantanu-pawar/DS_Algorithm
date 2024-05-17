package Questions_nd_CONCEPTS.I0I_Strings_SlidingWindows;

import java.util.Arrays;
import java.util.Comparator;

public class A2_String_Manipulation_UsingComparator {
    public static void main(String[] args) {

        /*
        * we've given a string, remove quomas and sort the complete string
        * and then return the response of that string */

        String str = "arman, man, this, is zendia";
        String result = str.replaceAll(",", "");
        String []arr = result.split(" ");

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2); // for ascending sort
                return o2.compareTo(o1); // for descending sort
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
