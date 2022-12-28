package streamApi2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EmployeeNames2 {

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
	
		enames.stream().filter(ename->ename.startsWith("R"))
		               .forEach(name->{System.out.println(name);});
					   

	}

}
