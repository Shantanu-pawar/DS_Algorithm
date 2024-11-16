import java.util.*;

class Solution {
    static void largestNumber(String a[], int n)
    {
        Arrays.sort(a, new Comparator<String>(){
			// if you return > 0 value then it will swap
			// otherwise it will not swap
			public int compare(String a, String b){
				String ab = a + b;
				String ba = b + a;
				// ab > ba return > 0 val
				// ab == ba return 0 val
				// otherwise < 0
				int val = ab.compareTo(ba);
				if(val >= 0) return -1;
				else return 1;
			}
		});
      for(int i = 0; i < n; i++){
        System.out.print(a[i]);
      }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String a[] = new String[n];

        for(int i = 0; i < n; i++){
            a[i] = input.next();
        }
        Solution Obj = new Solution();
        Obj.largestNumber(a,n);
    }
}






