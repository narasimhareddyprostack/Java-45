package MapEx;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx5 {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		
		m.put(101, "Rahul");
		m.put(102, "Sonia");
		m.put(103, "Priyanka");
		m.put(104, "Modi");
		
		m.remove(104);
		System.out.println(m);
		
		
	}

}
