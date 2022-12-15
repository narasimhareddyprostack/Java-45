package streamAPIEx;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AllNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<=10;i++) {
			al.add(i);
		}
		Stream<Integer> stream = al.stream();
		stream.map(value->value +1)
			  .forEach(v -> System.out.println(v));
	}

}
