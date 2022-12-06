package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		
		m.put(101, "Rahul");
		m.put(102, "Sonia");
		m.put(103, "Priyanka");
		m.put(104, "Modi");
		
		System.out.println(m);
		for(Object o:m.keySet())
			System.out.println(o);	
		System.out.println("******");
		for(Object o:m.values())
			System.out.println(o);	
		System.out.println("******");
		for(Object obj :m.entrySet()) {
			System.out.println(obj);	
		}
		Iterator i =m.entrySet().iterator();
		while(i.hasNext()) {
						Map.Entry x=(Entry)i.next();
						System.out.println(x.getKey() + ":"+ x.getValue());
		}
		
	}

}
