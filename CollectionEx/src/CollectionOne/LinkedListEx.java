package CollectionOne;

import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("Viswa");
	ll.add("Sudha");
	ll.add("Chaitanya");
	ll.add("kishroe");
	System.out.println(ll.size());
	
	System.out.println(ll);
	for(String ename:ll) {
		System.out.println(ename);
	}
}
}
