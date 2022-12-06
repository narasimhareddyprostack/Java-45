package QueueEx;

import java.util.PriorityQueue;

public class QueueExample4 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer("A");
		pq.offer("B");
		pq.offer("C");
		boolean flag = pq.add(30);
		System.out.println(pq);
		System.out.println(flag);
		//System.out.println(pq.element()); //Queue is empty - exception
		//System.out.println(pq.peek());  //Queue is empty - null
		
		

	}

}
