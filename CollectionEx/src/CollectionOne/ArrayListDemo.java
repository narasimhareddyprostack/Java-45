package CollectionOne;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//create arraylist with integer elements
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		//create ArrayList with String elements 
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Rahul Gandhi");  //index 0
		al2.add("Sonia");         //index 1
		al2.add("Priyanka");      //index 2
		al2.add("Modi");          //index 3
		//print arrayList
		System.out.println(al2);
		//return ArrayList Size
		System.out.println(al2.size());
		System.out.println(al2.isEmpty());
		System.out.println(al2.contains("Rahul"));
		System.out.println(al2.get(1));
		al2.set(1, "Sha");
		System.out.println(al2);

	}

}
