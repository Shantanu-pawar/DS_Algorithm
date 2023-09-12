package I6I_Stacks_Queues;
/*

acciojob code ::

“(aa(bdc))p(dee)ae”
Output :
1 2 2 1 3 3

((((())
Output : 1 2 3 4 4 5

*/

import java.util.Scanner;
import java.util.Stack;

public class Stacks_BracketCode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        String s = sc.next();
        int []ans = new int[s.length()];

        int count = 0;
        for(int i =0; i < s.length(); ++i) {
            if(s.charAt(i) == '(') {
                ++count;
                ans[i] = count;
                st.push(i);
            }
            if(s.charAt(i) == ')') {
                ans[i] = ans[st.pop()];
            }
        }
        // (aa(bdc))p(dee)ae

        for(int i =0; i < s.length(); ++i) {
            if(ans[i] != 0) {
                System.out.println(ans[i]);
            }
        }

    }
}

