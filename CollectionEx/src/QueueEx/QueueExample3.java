package QueueEx;

import java.util.PriorityQueue;

public class QueueExample3 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer("A");
		pq.offer("B");
		pq.offer("C");
		pq.offer("D");
		System.out.println(pq);
		pq.remove();
		pq.poll();
		
		System.out.println(pq);
		
		
		

	}

}
