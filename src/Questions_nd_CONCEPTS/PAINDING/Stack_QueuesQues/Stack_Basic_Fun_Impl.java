import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(756);
		st.push(8);
		
		System.out.println("print your Stack : " + "" + st);
		
		System.out.println( '\n' +"delete element and then print it -> " + "" + st.pop());
		System.out.println(st);
		
		System.out.println('\n' +" denotes only top element -> "+ st.peek());
		
		System.out.println('\n' +"now check if stack is empty -> " + st.empty());
		System.out.println('\n' +"reffer the size of stack -> " + st.size());
		
		
	}
}
