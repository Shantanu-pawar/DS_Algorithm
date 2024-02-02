package AccentureQuestions;

/*
Problem Description:

The function accepts a character array ‘arr’ of size ‘n’ as its argument. Each element of ‘arr’
 represents the status of a parking slot, where ‘S’ represents an empty slot and ‘X’ represents
 an occupied slot. The function needs to return the maximum number of cars that can be parked in
  the parking lot. It is assumed that two cars cannot occupy the same slot and cars can only park
   in consecutive empty slots.

* */

import java.util.Arrays;

public class a2_parkingLot_PRACTICE {
    public static void main(String[] args) {
        String str = "XXXSXXSXXSSXXSXX";

        char []arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));
    }
}
