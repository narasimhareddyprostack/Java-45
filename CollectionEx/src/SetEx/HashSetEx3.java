package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx3 {

	public static void main(String[] args) {
		//default capacity - 16 
		//load factor / fill ration: 0.75f
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		//union operation
		//hs1.addAll(hs2);
		//System.out.println(hs1);
		hs1.retainAll(hs2);
		System.out.println(hs1);
	}

}
