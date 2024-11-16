import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {

		  // base case : first store all the elemt's into hashmap 
		HashMap <Integer, Integer> map = new HashMap <>();
            for(int i=0; i<n; i++) {
            int a = arr[i];
            
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            }
            else map.put(a, 1);
        }
        
		HashMap <Integer, Integer> map2 = new HashMap <>();
		for(int i=0; i<m; i++) {
		    int b = brr[i]; 
		    
		    if(map2.containsKey(b) ) {
		        map2.put(b, map2.get(b) + 1);
		    }
		    else map2.put(b, 1);
 		}
 		
	// case1 =if frequency is not same that's the missing no so return it
	// case2 =else if no is not contains in previous set's then return that no

// 10000 cause there is constrains in our ques
		boolean flag = false;
	    for(int i=1 ; i<= 10000; i++ ) {
	        
	       // case1 : if key is present in 2nd arr but not 1st 
	        if(map2.containsKey(i) == true && map.containsKey(i) == false) {
	        System.out.print(i + " ");
				flag = true;
			}
				
	       // case2 : if key is present in both arr but frequency is less 
	       else if(map.containsKey(i) && map2.containsKey(i) && map.get(i) != map2.get(i)) {
	       System.out.print(i + " ");
			flag = true;
		   }

	    }

		// cover last case if all element's are perfect then just return -1 that's why use flag datatype
	    if(flag == false)
		System.out.println(-1);
		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
        
    }
}
