package streamApi2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNames4 {

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
	
		//displsy employee names in lowercase list
		System.out.println(enames);
		List<String> names= enames.stream()
		      .map(ename -> ename.toLowerCase())
		      .collect(Collectors.toList());
		System.out.println(names);
					   

	}

}
