package streamApi2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EmployeeNames3 {

	public static void main(String[] args) {
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Priyanka");
		enames.add("Sagnik");
		enames.add("Biplob");
		enames.add("Chai");
		enames.add("Rajnikanth");
		enames.add("Gautham");
	
		//How employee names start with 'R'
		
		long count = enames.stream()
				           .filter(ename->ename.startsWith("R"))
				           .count();
		System.out.println(count);
					   

	}

}
