package CollectionOne;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		ArrayList<String> enames = new ArrayList<String>();
		enames.add("Rahul Gandhi");  //index 0
		enames.add("Sonia");         //index 1
		enames.add("Priyanka");      //index 2
		enames.add("Modi");          //index 3
		
		/*for(String ename : enames) {
			System.out.println(ename);
		}		
		for(int i=0; i<=enames.size()-1; i++) {
			System.out.println(enames.get(i));
		}*/

		Iterator i = enames.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());		}

	}

}
