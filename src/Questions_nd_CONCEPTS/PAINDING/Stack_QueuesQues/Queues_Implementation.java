package Questions_nd_CONCEPTS.PAINDING.Stack_QueuesQues;

import java.util.*;

class Queues_Implementation {}

class Main {
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
// 		insert elements 
		q.offer(20);
		q.offer(23);
		q.offer(29);
		q.offer(2);
		System.out.println(q);
		
		//remove elements from front 
		q.poll();
		System.out.println(q);
		System.out.println(q.poll() + " " + "deleted value");
		
		System.out.println( '\n' + "now check size , and call the front elemnt " + '\n');
		
		System.out.println(q.size() + " : is the size of queues");
		System.out.println(q.peek() + " : is the front elemt ");
		System.out.println(q.isEmpty() + " : is the elment is empty or not ");
	}
}
