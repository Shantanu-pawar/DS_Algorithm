package Questions_nd_CONCEPTS.PAINDING.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class f_minimum_Swaps_required_to_sortArr {
    public static int minSwaps(int[] arr) {
        int n  = arr.length, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int []b = new int[n];
        // just store element's into your hashmap and dummy arr
        for(int i=0; i<arr.length;i++) {
            b[i] = arr[i];
            map.put(arr[i], i);
        }
        //case1 : create your ideal arr to compare with and sort it
        Arrays.sort(b);

        for(int i=0; i<n ;i++) {

            if(arr[i] != b[i]) {
                int ind = map.get(b[i]); // just find the index of the value b
                // case 2 : now let's do general swaping
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;

                // case 3 : update this in your hashmap also
                map.put(arr[i], i);
                map.put(arr[ind], ind);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minSwaps(arr);
        System.out.println(ans);
    }
}
