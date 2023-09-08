package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

import java.util.Scanner;

public class Shuffle_String {
    public static void main(String[] args) {

// Shuffle String
// https://course.acciojob.com/idle?question=ac357ab6-b52a-4e37-ae2e-7afac866afb7

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        // 1. take user input from array
        int [] arr = new int[n];
        for(int i = 0; i< n; i ++) {
            arr[i]  = in.nextInt();
        }

        // 2. now seperate characters
        char [] crr = new char[n];
        for(int i=0; i<n ; i++) {

            // first pick your current element
            char x = s.charAt(i);
            //then find target element from your main input array
            int target = arr[i];
            // then store it in your new crr array
            crr[target]  = x;
        }
        String ans = new String (crr);
        System.out.println(ans);
    }
}
