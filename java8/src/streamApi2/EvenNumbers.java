package streamApi2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=10;i<=20;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		List evenNumbers =al.stream().filter(num->num%2 ==0)
		.collect(Collectors.toList());
		System.out.println(evenNumbers);
	  
		

	}

}
