package CollectionOne;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx2 {
public static void main(String[] args) {
	LinkedList<String> ll1 = new LinkedList<String>();
	ll1.add("Viswa");
	ll1.add("Sudha");
	ll1.add("Chaitanya");
	ll1.add("kishroe");
	LinkedList<String> ll2 = new LinkedList<String>();
	//ll2.add(null);
	ll2.add("Rajni");
	ll1.addAll(ll2);
	System.out.println(ll1);
	Collections.sort(ll1,Collections.reverseOrder());
	System.out.println(ll1);System.out.println(ll1);
	
	
}
}
