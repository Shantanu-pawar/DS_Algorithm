package Questions_nd_CONCEPTS.I5I_HashMaps_Sets;
import java.util.*;

//  portal ques : https://course.acciojob.com/idle?question=c47351e9-e120-488d-a193-0fdc5ab7a56b
public class countNumbers {
    public static int countPairsWithDiffK(int[] a, int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<a.length; i++) {
            int n = a[i];
            if(map.containsKey(n)) map.put(n, map.get(n) + 1);
            else map.put(n, 1);
        }

		/*approach : so we just add k nums at each element's and check if that pair is
		available in the map or not and then just count it   */

        long count = 0;
        for(int x : map.keySet()) {
// this map.get(x) >1  handle's the edge case when k == 0
// how ? so we basically check if our element is repeated more than 1, it make pair and that'll we want
            if ((k == 0 && map.get(x) > 1) || (k!=0 && map.containsKey(x + k)) ) count++;

            // you can check it by simply by print the statement
// 			 System.out.println(x + " " + (x+k) );
        }
        return (int)count;



        // naive approach using bubble sort approach
/*
    int count = 0;
    for (int i=0; i<a.length; i++) {
      // See if there is a pair of this picked element
      for (int j=i+1; j<a.length; j++)
	        if (Math.abs(a[i] - a[j]) == k)  count++;

	}
    return count;
*/
    }

    public static void main(String[] args) {

        int [] a = {2, 4, 6, 6, 2 , 3, 1};
        int k = a.length;
        System.out.println(countPairsWithDiffK(a, k));
    }
}
