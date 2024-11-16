import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                }

                int ans[] = new int[n];
                Stack<Integer> st = new Stack<>();
		
                for(int i = 0; i < n; i++){
                    // means same elememts pop out hhere
					while(!st.empty() && arr[i] >= arr[st.peek()])
							st.pop();

					if(!st.empty())
                    // the st.peek() contains index of prev gretaer element
                            ans[i] = i - st.peek();
                        
                    
					else  // stack is empty
	                         ans[i] = i + 1;
                        
                        st.push(i); // index of current element
                }

                for(int i = 0; i < n; i++){
                        System.out.print(ans[i] + " ");
                }
        }
}

