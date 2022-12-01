package CollectionOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[] args) {
	
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("Rahul Gandhi");  //index 0
		enames.add("Sonia");         //index 1
		enames.add("Priyanka");      //index 2
		enames.add("Modi");          //index 3
		
		Collections.sort(enames);
		System.out.println(enames);
		//display elements in reverse order 
		Collections.sort(enames, Collections.reverseOrder());
		System.out.println(enames);
		
		Collections.shuffle(enames);
		System.out.println(enames);
		
	}

}
