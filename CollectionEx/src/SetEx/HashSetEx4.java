package SetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx4 {

	public static void main(String[] args) {
		//default capacity - 16 
		//load factor / fill ration: 0.75f
		HashSet<Integer> numbers = new HashSet<Integer>(200,0.9f);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		HashSet<Integer> even_Numbers = new HashSet<Integer>(200,0.9f);
		even_Numbers.add(6);
		even_Numbers.add(7);
		//union operator on set objects
		numbers.addAll(even_Numbers);
		System.out.println(numbers);
	}

}
