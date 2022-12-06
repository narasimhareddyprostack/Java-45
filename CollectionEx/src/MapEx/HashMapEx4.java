package MapEx;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx4 {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		
		m.put(101, "Rahul");
		m.put(102, "Sonia");
		m.put(103, "Priyanka");
		m.put(104, "Modi");
		
		Set s = m.keySet();
		System.out.println(s);
		for(Object obj:s) {
			System.out.println(m.get(obj));
		}
		
	}

}
