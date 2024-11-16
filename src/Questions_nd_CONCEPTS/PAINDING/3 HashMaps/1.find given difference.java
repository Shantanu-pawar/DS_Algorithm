
import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []arr, int n, int target) {

/*     optimised approach
    logic : the main logic part here is simply, substract and add the target element in all 
    arr elements and then check if the ans is present in hashmap or not
    
    arr : 5 8 7  target : 78
    EX : check (5+78 || 5-78) 
    if it's present in map simply return 
    if not present simply add the no for future cross checking 
    
*/

        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i<n; i++ ) {
            // reffer logic incase formulae don't understand to you
            if(map.containsKey(arr[i]-target) || map.containsKey(arr[i]+target))
            return 1;
            
            map.put(arr[i], 1);
        }
        return 0;

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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
