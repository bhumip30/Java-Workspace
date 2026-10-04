package stringComparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class StringQueue {

	public static void main(String[] args) {
		Queue <String> queue = new PriorityQueue <>();
		
		queue.add("add");
		queue.add("substract");
		queue.add("divide");
		queue.add("multiplication");
		queue.add("modulus");
		
		System.out.println(queue);
		
		System.out.println("head: " + queue.peek());
		
		while(queue.size() > 0) {
			System.out.println(queue.poll() + ":" + queue.size());
		}
	}

}
