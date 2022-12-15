package streamAPIEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllNumbers2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		Stream<Integer> stream = al.stream();
		
		List list = stream.map(value->value +1)
			  .collect(Collectors.toList());
		
		System.out.println(list);
	}

}
