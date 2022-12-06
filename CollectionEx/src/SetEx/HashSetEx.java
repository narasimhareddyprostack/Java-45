package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>(200,0.9f);
		
		hs.add(10);
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		/*
		 * for(Object obj:hs) {
		 
			System.out.println(obj);
		}
	*/
	    Iterator i= hs.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }

	}

}
