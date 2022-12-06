package SetEx;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add("Rahul");
		hs.add(300.5);
		hs.add(null);
		System.out.println(hs);
		
		for(Object obj:hs) {
			System.out.println(obj);
		}

	}

}
