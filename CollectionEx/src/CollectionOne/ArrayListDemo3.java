package CollectionOne;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("Rahul Gandhi");  //index 0
		enames.add("Sonia");         //index 1
		enames.add("Priyanka");      //index 2
		enames.add("Modi");          //index 3
		
		ArrayList<String> new_Enames = new ArrayList<String>();
		new_Enames.add("Sagnik");
		new_Enames.add("Viswa");
		new_Enames.add("Sudha");
		enames.addAll(new_Enames);
		System.out.println(enames);
		enames.removeAll(new_Enames);
		System.out.println(enames);
		enames.remove(1);
		System.out.println(enames);
		
	}

}
