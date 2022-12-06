package MapEx;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		System.out.println(m);//empyt map object
		m.put(101, "Rahul");
		m.put(102, "Sonia");
		m.put(103, "Priyanka");
		System.out.println(m);//{101=Rahul, 102=Sonia}
		System.out.println(m.get(103));//Priyanka
		System.out.println(m.keySet());//[101, 102, 103]
		System.out.println(m.values());//[Rahul, Sonia, Priyanka]
		System.out.println(m.containsKey(103));//true
		System.out.println(m.containsValue("Rahul1"));//true

		
	}

}
