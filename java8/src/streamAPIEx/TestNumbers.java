package streamAPIEx;

import java.util.ArrayList;

public class TestNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<=10;i++) {
			al.add(i);
		}
		System.out.println(al);
		//create Stream objct
		al.stream()
		.filter((ele)-> { return ele%2 ==0; })
		.forEach((list)->{  System.out.println(list);});
	}

}
