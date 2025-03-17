package Questions_nd_CONCEPTS.PAINDING.HashMap;

import java.util.HashMap;

public class a_Find_Given_Difference {
    public static void main(String[] args) {

        int []arr = {5,8,7};
        int n = arr.length;
        int target = 78;
    /*
        optimised approach

        logic : the main logic part here is simply, substract and add the target element in all
        arr elements and then check if the ans is present in hashmap or not

        arr : 5 8 7  target : 78
        EX : check (5+78 || 5-78)
        if it's present in map simply return
        if not present simply add the no for future cross checking

    */

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<n; i++ ) {
            // reffer logic incase formulae don't understand to you
            if(map.containsKey(arr[i]-target) || map.containsKey(arr[i]+target))
                System.out.println(1);

            map.put(arr[i], 1);
        }
        System.out.println(0);

/*      //  neive approach
		Arrays.sort(arr);
        boolean check = false;
		for(int i=0; i<n; i++ ){
			for(int j=0; j<n; j++) {
				int a  = Math.abs(arr[i] - arr[j]); // find absolute value | -1, 3|

				if(a == target)  return 1;
			}
		}
		return 0;   */

    }
}
