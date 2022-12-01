package CollectionOne;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx4 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Viswa");
	al.add("Sudha");
	al.add("Chaitanya");
	al.add("kishroe");
	al.add("Rajni");
	al.add("Nayana");
	//print last element
	System.out.println(al.get(al.size()-1));
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("Viswa");
	ll.add("Sudha");
	ll.add("Chaitanya");
	ll.add("kishroe");
	ll.addFirst("Rajni");
	ll.addLast("Nayana");
	System.out.println(ll.getLast());
	
	
	
	
}
}
