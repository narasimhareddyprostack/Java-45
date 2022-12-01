package CollectionOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo5 {

	public static void main(String[] args) {
	
		String[] enames = {"Chai","Sudha","Kishore","Viswa"};
		System.out.println(enames);
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(enames));
		System.out.println(al);
		for(String ename : al) {
			System.out.println(ename);
		}
	}

}
