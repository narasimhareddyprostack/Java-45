package MapEx;

import java.util.HashMap;

public class HashMapEx3 {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		
		m.put(101, "Rahul");
		m.put(102, "Sonia");
		m.put(103, "Priyanka");
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		

		
	}

}
