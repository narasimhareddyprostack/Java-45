package streamAPIEx;

import java.util.ArrayList;

public class EmployeeNames {

	public static void main(String[] args) {
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("sagnik");
		enames.add("kishore");
		enames.add("chai");
		enames.add("sudhakar");
		enames.add("jai");
		enames.add("gagan");
		enames.add("sai");
		enames.stream().map(ename -> ename.toUpperCase())
		   .forEach(System.out::println);

		/*
		enames.stream().map(ename -> ename.toUpperCase())
					   .forEach(ename->System.out.println(ename));;
	    */
	}

}
