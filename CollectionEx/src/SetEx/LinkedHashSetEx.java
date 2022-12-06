package SetEx;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		HashSet hs  = new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add(20.5);
		hs.add("Rahul");
		hs.add('Y');
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(10);
		lhs.add(20.5);
		lhs.add("Rahul");
		lhs.add('Y');
		System.out.println(hs);
		System.out.println(lhs);
	}

}
