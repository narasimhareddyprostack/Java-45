package QueueEx;

import java.util.LinkedList;

import java.util.PriorityQueue;

public class QueueExample5 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		LinkedList ls = new LinkedList();
		//pq.add("A");
		//pq.add("B");
		//pq.add("C");
		//pq.add(100);// Queue not allowed heterogenous elements
		//System.out.println(pq);
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add(100);
		System.out.println(ls);
	}
}
