 
import java.util.*;
class Main{
  
    public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
 
		for(int test =0; test < d; test++) {
			
			int n = in.nextInt();
			int []arr= new int[n];
//       take inputs 
			for(int i=0; i<arr.length; i++) arr[i] = in.nextInt();
			
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i : arr) {
				hm.put(i, hm.getOrDefault(i, 0) + 1);
			}
				
			int max = 0, ans = Integer.MIN_VALUE;
			for (int i : arr) {
				if (hm.get(i) > max) {
					max = hm.get(i);
					ans = i;
				}
			}
			System.out.println(ans);
		}
		
    }
}
 
