package Questions_nd_CONCEPTS.I0I_Strings_SlidingWindows;
import java.util.*;


/*  https://leetcode.com/problems/largest-number/

        crossQuestion : make this largest number : first have this chars 3304539
            and then make a large number from this : 9543330    */

public class A3_Largest_Number_PracticeIt {
    public static void main(String[] args) {
        String[] a = {"3", "30", "4", "53", "9"};

        int n = a.length;
        largestNumber(a, n);
    }

    static void largestNumber(String[] a, int n) {

        Arrays.sort(a, new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;

                int val = ab.compareTo(ba);

                if (val >= 0) return -1;
                else return 1;
            }
        });

        System.out.println(Arrays.toString(a));
    }
}
