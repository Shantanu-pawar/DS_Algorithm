import java.util.*;
import java.lang.*;
import java.io.*;

	// optimal approach using queue's 
class Solution{
    public String FirstNonRepeating(String st){
		String ans = "";
		
		// case 1:create an freq arr for storing freq
		int [] freq = new int[26];
		Queue <Character > q = new LinkedList<>();

		// case2 : keep popping until we get our freq as 1 and print
		// if all element's poped means print # cause no element is non-repeating
		for(int i=0; i<st.length(); i++ ){
			char ch = st.charAt(i);

// so add freq and char into our Queue
			freq[ch - 'a']++;
			q.add(ch);

// case 3: pop the queue until the front char freq is one 
			while(q.size() > 0  && freq[q.peek() - 'a'] > 1)  q.poll();

// case 4 : if queue become's emplty then you dont have non repeating char's 
			if(q.size() == 0) ans += "#";
			else ans += q.peek(); // here we just store the last character whose freq is 1
		}
		
		return ans;
	}
}


class Main{
    public static void main(String[] args) throws IOException{
	    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine().trim();
        Solution ob = new Solution();
        String ans = ob.FirstNonRepeating(A);
        System.out.println(ans);
    }
}

class Solution{
    public String FirstNonRepeating(String st){
		
// 		solve using freq arr method here : 
	String ans = "";
        int [] freq = new int[26];
        
        for(int i=0; i<st.length(); i++) {

	// base case :: simply count the freq in arr right
	char ch = st.charAt(i);
            freq[ch - 'a']++;
/*
case1 : just check if our ch is present only one time in freq then only print
	just remember you have to print first occuring char so 
		a a b c -> in this case
		a # b b = cause the freq of b is still 1 till c
*/
            boolean check = false;
            for(int j=0; j<= i; j++) {
		if(freq[ st.charAt(j) - 'a'] == 1) {
                    ans += st.charAt(j);
                    check = true;
  // when you found non repeating then you don't need to check further so..
                    break;
                }
            }

// case2 : otherwise just print # cause there is duplicate element's
            if(check == false) ans += "#";   
        }
	return ans;
    }
}


