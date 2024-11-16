import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
        
        Scanner in = new Scanner(System.in);
        String str = in.next();

        Stack<Character> st = new Stack <>();

// this is for store the characters of strings in stack
        for(int i=0; i<str.length(); i++) {
            st.push ( str.charAt (i) );
        }

        // // here now just print and delete that elements simultaniously 
        //     while(! st.empty()) {
        //         System.out.print(st.pop());
        //     }


        // another approach 
        String ans = "";
        while( !st.empty()) {
            ans += st.pop();
        }
        System.out.println(ans);
    }
}